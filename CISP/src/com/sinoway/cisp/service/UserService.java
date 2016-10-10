package com.sinoway.cisp.service;

import com.sinoway.cisp.entitys.User;

public interface UserService {
	/**
	 * 通过key查找用户
	 */
	public User selectUserByKey(String key);
	
	
	
}
