package com.sinoway.cisp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.UserMapper;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.entitys.UserExample;
import com.sinoway.cisp.entitys.UserExample.Criteria;
import com.sinoway.cisp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 通过key查找用户
	 */
	public User selectUserByKey(String key) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserKeyEqualTo(key.trim());
		List<User> list = userMapper.selectByExample(example);
		User user = null;
		//判断,并返回单个对象
		if(list!=null && list.size()>0){
			user = list.get(0);
		}
		return user;
	}

}
