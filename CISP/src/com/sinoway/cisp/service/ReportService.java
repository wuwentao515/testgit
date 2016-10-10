package com.sinoway.cisp.service;

import java.util.List;
import java.util.Map;

import com.sinoway.cisp.entitys.User;

public interface ReportService {
	
	/*
	 * 参数 :cardid
	 * return:报告的map形式
	 */
	public List<String> getReport(String cardid,User user) throws Exception;
	
}
