package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.BLackListVo;
import com.sinoway.cisp.entitys.BlackList;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.utils.Page;

import java.util.List;

public interface BlackListMapper {
	// 插入黑名单
	int insert(BlackList record);
    //查询不良记录
	List<BLackListVo> selectByExample(String username,String cardid);
	//查询机构简称
	String selectShortName(String instiCode);
}