package com.sinoway.cisp.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinoway.cisp.dao.UserMapper;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.JedisService;
import com.sinoway.cisp.service.TestRedis;
import com.sinoway.cisp.utils.JsonUtils;

@Service
public class TestRedisImpl implements TestRedis {
	

	@Autowired
	private  JedisService jedisService;
	@Autowired
	private UserMapper userMapper;
	private User user;
	@Override
	public String insertRedis(String userAccount) {
		// TODO Auto-generated method stub
		
		
		
		String  str=	jedisService.get("u");
		
		if (StringUtils.isNotEmpty(str)) {
			user = JsonUtils.jsonToPojo(str, User.class);
			
		}else{
               user=userMapper.selectByPrimaryKey(userAccount);
			   try {
				jedisService.set("u", JsonUtils.objectToJson(user));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return str;
	}

}
