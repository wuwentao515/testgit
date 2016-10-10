package com.sinoway.cisp.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sinoway.cisp.utils.MD5;
import com.sinoway.cisp.utils.PageFetcher;

public class QJCTest {

   //测试进件
   @Test
   public void pushLoanInfo() throws Exception{
	  
		String url = "http://localhost:8081/CISP/CISPApi/pushLoanInfo";
//	   String url = "https://cispapi.sinowaycredit.com/CISP/CISPApi/pushLoanInfo";
		String content="{\n" +
				"        \"basic_info\": {\n" +
				"            \"cell_phone_num\": \"18693152204\",\n" +
				"            \"edu\": \"1\"\n" +
				"        },\n" +
				"        \"loan_info\": {\n" +
				"            \"request_location\": \"1100\",\n" +
				"            \"request_type\": \"1\",\n" +
				"            \"request_money\": 20000.55,\n" +
				"            \"request_time\": \"2016-08-31\"\n" +
				"        }\n" +
				"}";
		
		String key = "1234567";
		String cmd = "loan";
		String isgetreport = "1";
		String version = "1.0";
		String data = content;
		String name = "qjc";
		String cardid = "111111111111111111";
		String crid = "111111";
		String user_private = "456";
		String sign = MD5.process(key + cmd + isgetreport + version + name + cardid + crid + user_private);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("key", key);
		params.put("sign", sign);
		params.put("cmd", cmd);
		params.put("isgetreport", isgetreport);
		params.put("version", version);
		params.put("data", data);
		params.put("name", name);
		params.put("cardid", cardid);
		params.put("crid", crid);
		PageFetcher pf = new PageFetcher();
		System.out.println(pf.dopost(url, params));
		
   }
   //测试合同
   @SuppressWarnings("unused")
@Test
   public void pushContractInfo() throws Exception{
		String url = "http://localhost:8081/CISP/CISPApi/pushLoanInfo";
		String acceptContent="{\n" +
				"    \"loan_info\": {\n" +
				"        \"request_time\": \"2016-08-01\",\n" +
				"        \"contract_sum\": 2000\n" +
				"    },\n" +
				"    \"op\": {\n" +
				"        \"accept\": {\n" +
				"            \"contract_id\": \"6645652\",\n" +
				"            \"pay_period\": \"12\",\n" +
				"            \"start_time\": \"2016-9-12\",\n" +
				"            \"stop_time\": \"2017-08-01\",\n" +
				"            \"contract_type\": \"1\",\n" +
				"            \"guara_type\": \"1\",\n" +
				"            \"pay_location\": \"123\"\n" +
				"        }\n" +
				"    }\n" +
				"}";
		
		String refuseContent = "{\n" +
				"    \"loan_info\": {\n" +
				"        \"request_time\": \"2016-08-01\",\n" +
				"        \"contract_sum\": 2000\n" +
				"    },\n" +
				"    \"op\": {\n" +
				"        \"refuse\": {\n" +
				"            \"refuse_reason\": \"1\",\n" +
				"            \"refuse_time\": \"2016-08-23\"\n" +
				"        }\n" +
				"    }\n" +
				"}";
		String delayContent = "{\n" +
				"    \"loan_info\": {\n" +
				"        \"request_time\": \"2016-08-01\",\n" +
				"        \"contract_sum\": 2000\n" +
				"    },\n" +
				"    \"op\": {\n" +
				"        \"delay\": \"\"\n" +
				"    }\n" +
				"}";
		String clientCancelContent = "{\n" +
				"    \"loan_info\": {\n" +
				"        \"request_time\": \"2016-08-01\",\n" +
				"        \"contract_sum\": 2000\n" +
				"    },\n" +
				"    \"op\": {\n" +
				"        \"clientcancel\": \"\"\n" +
				"    }\n" +
				"}";
		String key = "000000";
		String cmd = "cont";
		String isgetreport = "1";
		String version = "1.0";
		String data = acceptContent;
		String name = "qjc";
		String cardid = "361111719820711107";
		String crid = "201990921";
		String user_private = "111111";
		String sign = MD5.process(key + cmd + isgetreport + version + name + cardid + crid + user_private);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("key", key);
		params.put("sign", sign);
		params.put("cmd", cmd);
		params.put("isgetreport", isgetreport);
		params.put("version", version);
		params.put("data", data);
		params.put("name", name);
		params.put("cardid", cardid);
		params.put("crid", crid);
		PageFetcher pf = new PageFetcher();
		System.out.println(pf.dopost(url, params));
   }
   
}
