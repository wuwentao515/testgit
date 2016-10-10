package com.sinoway.cisp.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.JedisDao;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CheckSignService;
import com.sinoway.cisp.service.UserService;
import com.sinoway.cisp.utils.JsonUtils;
import com.sinoway.cisp.utils.MD5;

//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;

@Service
public class CheckSignServiceImpl implements CheckSignService {
	@Autowired
	private UserService userService;
	@Autowired
	private JedisDao jedisDao;
//	@Autowired
//	private JedisPool jedisPool;

	public String check(String key, String sign, String cmd, String isgetreport, String version, String name,
			String cardid, String crid) {
		String errorCode = null;
		User user = null;

//		Jedis jedis = jedisPool.getResource();
		String userJson = jedisDao.get("user");
		try {
			if (StringUtils.isNotEmpty(userJson)) {
				user = JsonUtils.jsonToPojo(userJson, User.class);
			} else {
				user = userService.selectUserByKey(key);
				jedisDao.set("user", JsonUtils.objectToJson(user));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (null == user) {
			errorCode = "1002";
		} else {
			String userPrivate = user.getUserPrivate();
			if (null != userPrivate) {
				String content = key + cmd + isgetreport + version + name + cardid + crid + userPrivate;
				boolean flag = false;
				try {
					flag = MD5.process(content).equals(sign);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					flag = false;
				}
				if (!flag) {
					errorCode = "1001";
				}
			} else {
				errorCode = "1006";
			}
		}
		return errorCode;
	}

	public String check(String key, String sign, String datatype, String version, String name, String cardid) {
		String errorCode = null;
		User user = userService.selectUserByKey(key);
		if (null == user) {
			errorCode = "1002";
		} else {
			String userPrivate = user.getUserPrivate();
			if (null != userPrivate) {
				String content = key + datatype + version + name + cardid + userPrivate;
				boolean flag = false;
				try {
					flag = MD5.process(content).equals(sign);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					flag = false;
				}
				if (!flag) {
					errorCode = "1001";
				}
			} else {
				errorCode = "1006";
			}
		}
		return errorCode;
	}
}
