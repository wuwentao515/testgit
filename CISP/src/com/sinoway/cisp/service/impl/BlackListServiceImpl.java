package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.BlackListMapper;
import com.sinoway.cisp.dao.LoanApplicationMapper;
import com.sinoway.cisp.dao.UserMapper;
import com.sinoway.cisp.entitys.BLackListVo;
import com.sinoway.cisp.entitys.BlackList;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.BlackListReportService;
import com.sinoway.cisp.service.CispBasicDataApiService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.IDUtil;
import com.sinoway.cisp.utils.JsonUtils;
import com.sinoway.cisp.utils.Page;
import com.sinoway.cisp.utils.ResponseJsonUtils;
import com.sinoway.cisp.utils.StringUtil;

@Service
public class BlackListServiceImpl implements CispBasicDataApiService {
	@Autowired
	private BlackListMapper mapper;
	@Autowired
	private UserMapper uMapper;
	@Autowired
	private SearchService searchService;
	@Autowired
	private BlackListReportService blackListReportService;
	
	public String pushCreditData(
			User user, 
			String datatype, 
			String version, 
			String name, 
			String cardid,
			String data) throws Exception {
		String result = null;
		
		BlackList blackList = new BlackList();
		blackList.setSinoid(IDUtil.getSinoId(user.getInstiCode().toString(), "D"));
		blackList.setName(name);
		blackList.setCardid(cardid);
		// 解析json
		JSONObject loanInfo;
		JSONObject overdueInfo;
		try {
			System.out.println(data);
			JSONObject json = new JSONObject(data);
			loanInfo = json.getJSONObject("loan_info");
			overdueInfo = json.getJSONObject("overdue_info");
			String overdueStartTime = (String) overdueInfo.get("overdue_start_time");
			Date date = DateUtils.parseDate(overdueStartTime);
			blackList.setOverdueStartTime(date);
			int mon = Integer.parseInt(overdueInfo.get("overdue_money").toString());
			BigDecimal m = new BigDecimal(mon);
			blackList.setOverdueMoney(m);
			blackList.setLoanLocation(loanInfo.getString("pay_location"));
			blackList.setLoanType(loanInfo.getString("loan_type"));
			blackList.setLoanGuarantee(loanInfo.getString("loan_guarantee"));
			String loanStart = (String) loanInfo.get("loan_start_time");
			blackList.setLoanStartTime(StringUtil.stringToDate(loanStart, "yyyy-MM-dd"));
			blackList.setPhone(loanInfo.getString("phone"));
			blackList.setEmail(loanInfo.getString("email"));
			blackList.setPersonalAddress(loanInfo.getString("born_location"));
			blackList.setLiveAddress(loanInfo.getString("live_location"));
			blackList.setOverdueTimes(overdueInfo.getString("overdue_times"));
			
			
			blackList.setOverdueDuration(overdueInfo.getString("overdue_longest_duration"));
			blackList.setReason(overdueInfo.getString("overdue_reason"));
			blackList.setOverdueStatus(overdueInfo.getString("overdue_status"));
			blackList.setUserAccount(user.getUserAccount());
			blackList.setPublicTime(new Date());
			mapper.insert(blackList);
			
			result = ResponseJsonUtils.creaRespJson(true, null, null);
		} catch (Exception e) {
			result = ResponseJsonUtils.creaRespJson(false, "1003", null);
		}
		return result;
	}

	public String getCreditData(
			User user,  
			String datatype, 
			String version,
			String name, 
			String cardid,
			String qreason) throws Exception {
		String result = null;
//		user.getUserAccount();
		searchService.insBlackListSearchReport(
				user,
				qreason,// 进件???
				null,
				new Date(),//请填上申请时间、sinotime
			    name,
			    cardid,
			    new Date());//请填上申请时间、sinotime
		String report = blackListReportService.getReport(name,cardid, user);
		result = ResponseJsonUtils.creaRespJson(true, null, report);
		return result;
	}
}
