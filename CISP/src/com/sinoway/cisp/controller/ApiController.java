package com.sinoway.cisp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CheckSignService;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.CispBasicDataApiService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.UserService;
import com.sinoway.cisp.utils.ResponseJsonUtils;
@Controller
@RequestMapping("/CISPApi")
public class ApiController {
	@Resource(name="LoanService")
	private CispBasicApiService loanService;
	@Resource(name="ContractService")
	private CispBasicApiService contractService;
	@Resource(name="collectionService")
	private CispBasicApiService collectionService;
	@Resource(name="debtService")
	private CispBasicApiService debtService;
	@Resource(name="inventoryService")
	private CispBasicApiService inventoryService;
	@Autowired
	private CispBasicDataApiService blackListService;
	
	@Autowired
	private CheckSignService checkSignService;
	@Autowired
	private UserService userService;
	@Autowired
	private ResponseJsonService responseJsonService;

	@RequestMapping(value = "/pushLoanInfo", method = RequestMethod.POST, produces = "application/html;charset=UTF-8")
	public @ResponseBody String pushLoanInfo(
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "sign", required = false) String sign,
			@RequestParam(value = "cmd", required = false) String cmd,
			@RequestParam(value = "isgetreport", required = false) String isgetreport,
			@RequestParam(value = "version", required = false) String version,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "cardid", required = false) String cardid,
			@RequestParam(value = "crid", required = false) String crid,
			@RequestParam(value = "data", required = false) String data, 
			HttpServletRequest req,
			HttpServletResponse res) {
		String result = null;
		if (     ( null == key         || "".equals(key) )         ||
				 ( null == sign        || "".equals(sign) )        ||
				 ( null == cmd         || "".equals(cmd) )         ||
				 ( null == isgetreport || "".equals(isgetreport) ) ||
				 ( null == version     || "".equals(version) )     ||
				 ( null == name        || "".equals(name) )        ||
				 ( null == cardid      || "".equals(cardid) )      ||
				 ( null == crid        || "".equals(crid) )        ||
				 ( null == data        || "".equals(data) ) 
			   ) {
				result = responseJsonService.creaRespJson(null,null,null,null,false, "1001", null);
		}else{
			User user = userService.selectUserByKey(key);
			String errorCode = checkSignService.check(
					key, 
					sign, 
					cmd, 
					isgetreport, 
					version, 
					name, 
					cardid, 
					crid);
			if ( null != errorCode ){
				result = responseJsonService.creaRespJson(null,null,null,null,false, errorCode, null);
			} else {
				if (cmd.equals("loan")) {
					result = loanService.pushLoanInfo(user, cmd, isgetreport, version, name, cardid, crid, data);
				} else if (cmd.equals("cont")) {
					result = contractService.pushLoanInfo(user, cmd, isgetreport, version, name, cardid, crid, data);
				}
				else if(cmd.equals("over")){
					result = collectionService.pushLoanInfo(user, cmd, isgetreport, version, name, cardid, crid, data);
				} else if(cmd.equals("up")){
					result = debtService.pushLoanInfo(user, cmd, isgetreport, version, name, cardid, crid, data);
				} else if(cmd.equals("stock")){
					result = inventoryService.pushLoanInfo(user, cmd, isgetreport, version, name, cardid, crid, data);
				} else {
					result = responseJsonService.creaRespJson(user, null, name, cardid, false, "1003", null);
				}
			}
		}
		return result;
		
	}

	@RequestMapping(value = "/pushCreditData", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String pushCreditData(
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "sign", required = false) String sign,
			@RequestParam(value = "datatype", required = false) String datatype,
			@RequestParam(value = "version", required = false) String version,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "cardid", required = false) String cardid,
			@RequestParam(value = "data", required = false) String data, 
			HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String result = null;
		
		if (     ( null == key         || "".equals(key) )         ||
				 ( null == sign        || "".equals(sign) )        ||
				 ( null == datatype    || "".equals(datatype) )    ||
				 ( null == version     || "".equals(version) )     ||
				 ( null == name        || "".equals(name) )        ||
				 ( null == cardid      || "".equals(cardid) )      ||
				 ( null == data        || "".equals(data) ) 
			   ) {
				result = ResponseJsonUtils.creaRespJson(false, "1003", null);
		} else {
			User user = userService.selectUserByKey(key);
			String errorCode = checkSignService.check(
					key, 
					sign,
					datatype,
					version, 
					name, 
					cardid);
			if ( null != errorCode ){
				result = ResponseJsonUtils.creaRespJson(false, errorCode, null);
			} else {
				result = blackListService.pushCreditData(
						user,
						datatype,
						version,
						name,
						cardid,
						data);
			}
		}
		return result;
	}

	@RequestMapping(value = "/getCreditData", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getCreditData(@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "sign", required = false) String sign,
			@RequestParam(value = "datatype", required = false) String datatype,
			@RequestParam(value = "version", required = false) String version,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "cardid", required = false) String cardid, 
			@RequestParam(value = "qreason", required = false) String qreason, 
			HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String result = null;
		
		if (     ( null == key         || "".equals(key) )         ||
				 ( null == sign        || "".equals(sign) )        ||
				 ( null == datatype    || "".equals(datatype) )    ||
				 ( null == version     || "".equals(version) )     ||
				 ( null == name        || "".equals(name) )        ||
				 ( null == cardid      || "".equals(cardid) )      ||
				 ( null == qreason     || "".equals(qreason) )
			   ) {
				result = ResponseJsonUtils.creaRespJson(false, "1003", null);
		} else {
			User user = userService.selectUserByKey(key);
			
			String errorCode = checkSignService.check(
					key, 
					sign,
					datatype,
					version, 
					name, 
					cardid);
			if ( null != errorCode ){
				result = ResponseJsonUtils.creaRespJson(false, errorCode, null);
			} else {
				result = blackListService.getCreditData(
						user,
						datatype,
						version,
						name,
						cardid,
						qreason);
			}
		}
		return result;
	}
}
