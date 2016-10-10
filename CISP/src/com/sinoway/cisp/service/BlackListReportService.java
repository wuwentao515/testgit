package com.sinoway.cisp.service;

import com.sinoway.cisp.entitys.User;

public interface BlackListReportService {
	public String getReport(
			String name,
			String cardid,
			User user) throws Exception;
}