package com.sinoway.cisp.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.SearchDetailMapper;
import com.sinoway.cisp.entitys.SearchDetail;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.IDUtil;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private SearchDetailMapper searchDetailMapper;
	
	public void insSearchReport(
			User user,
			String sinoid,
		    String reqReason,
		    String resultAdd,
		    Date reqTime,
		    String name,
		    String cardid,
		    Date sinotime){
		
		SearchDetail searchDetail = new SearchDetail();
		String reportId = IDUtil.getSinoId(user.getInstiCode().toString(), "Q");
		
		searchDetail.setReportId(reportId);
		searchDetail.setSinoid(sinoid);
		searchDetail.setUserAccount(user.getUserAccount());
		searchDetail.setReqReason(reqReason);
		resultAdd = "path/to/report/QRWE-F-G-0001.pdf";
		searchDetail.setResultAdd(resultAdd);
		searchDetail.setReqTime(reqTime);
		searchDetail.setName(name);
		searchDetail.setCardid(cardid);
		searchDetail.setSinotime(sinotime);
		
		searchDetailMapper.insert(searchDetail);
	}

	@Override
	public void insBlackListSearchReport(User user, String reqReason, String resultAdd,
			Date reqTime, String name, String cardid, Date sinotime) {
		SearchDetail searchDetail = new SearchDetail();
		String reportId = IDUtil.getSinoId(user.getInstiCode().toString(), "D");
		
		searchDetail.setReportId(reportId);
		searchDetail.setSinoid(reportId);
		searchDetail.setUserAccount(user.getUserAccount());
		searchDetail.setReqReason(reqReason);
		resultAdd = "path/to/report/QRWE-F-G-0001.pdf";
		searchDetail.setResultAdd(resultAdd);
		searchDetail.setReqTime(reqTime);
		searchDetail.setName(name);
		searchDetail.setCardid(cardid);
		searchDetail.setSinotime(sinotime);
		
		searchDetailMapper.insert(searchDetail);
		
	}
}