package com.sinoway.cisp.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.sinoway.cisp.entitys.User;

@Service
public interface SearchService {
	public void insSearchReport(
			User user,
			String sinoid,
		    String reqReason,
		    String resultAdd,
		    Date reqTime,
		    String name,
		    String cardid,
		    Date sinotime);
	public void insBlackListSearchReport(
			User user,
		    String reqReason,
		    String resultAdd,
		    Date reqTime,
		    String name,
		    String cardid,
		    Date sinotime);
}