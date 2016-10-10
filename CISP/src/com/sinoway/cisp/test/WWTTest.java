package com.sinoway.cisp.test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.MD5;
import com.sinoway.cisp.utils.PageFetcher;

public class WWTTest {
    
   @Test
   public void  testjson() throws JSONException{
/*
	 String data=  "{\n" +
			 "	\"overdue_info\": {\n" +
			 "		\"overdue_start_time\":\"2016-01-12\",\n" +
			 "		\"overdue_duration\":\"1\",\n" +
			 "		\"overdue_reason\":\"2\",\n" +
			 "		\"overdue_status\":\"2\"\n" +
			 "	}\n" +
			 "}";
		JSONObject json=new JSONObject(data);
		JSONObject jsonw =json.getJSONObject("overdue_info");
	    System.out.println(json);
	    String da= (String)jsonw.get("overdue_start_time");
	   System.out.println(da);*/
	   
	   String  data="{\n" +
			   "    \"op\": {\n" +
			   "        \"repayment\": {\n" +
			   "            \"paid_time\": \"2017-1-2\",\n" +
			   "            \"paid_money\": 22,\n" +
			   "            \"remark\": \"还款\"\n" +
			   "        },\n" +
			   "        \"settle\": {\n" +
			   "            \"settle_time\": \"2012-1-2\"\n" +
			   "        },\n" +
			   "        \"extendible\": {\n" +
			   "            \"extend_limit_time\": \"\",\n" +
			   "            \"whole_not_paid\": \"\"\n" +
			   "        },\n" +
			   "        \"overdue\": {\n" +
			   "            \"overdue_start_time\": \"\",\n" +
			   "            \"payment_leve\": \"1\",\n" +
			   "            \"overdue_reason\": \"1\",\n" +
			   "            \"overdue_status_mark\": \"\"\n" +
			   "        }\n" +
			   "    }\n" +
			   "}";
	   
	   JSONObject jsonobj=new JSONObject(data);
	   JSONObject json=jsonobj.getJSONObject("op");
	   Iterator iterator = json.keys();
	   String d="";
	   while(iterator.hasNext()){
		   System.out.println(iterator.next().toString());
		   d=iterator.next().toString();
	   }
	   JSONObject j=json.getJSONObject(d);
	   String s= (String) j.get("overdue_reason");
	   System.out.println(d+"=============");
	   System.out.println(s+"++++++++++++++");
   }
   @Test
   public void aa(){
	  
	   String s="2017-1-3";
	   Date d=  DateUtils.parseDate(s);
	   
	   System.out.println(d);
   }
   
    //测试贷中
   @Test
   public void pushDebtInfo() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String url = "http://localhost:8080/CISP/CISPApi/pushLoanInfo";
		
		  
/*				String url = "http://localhost:8080/CISP/CISPApi/pushLoanInfo";
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
				
				String key = "456";
				String cmd = "loan";
				String isgetreport = "1";
				String version = "1.0";
				String data = content;
				String name = "qjc";
				String cardid = "361111719877777";
				String crid = "201888888";
				String user_private = "444";
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
				System.out.println(pf.dopost(url, params));*/
/*
		String debtContent = "{\n" +
				"    \"op\": {\n" +
				"        \"repayment\": {\n" +
				"            \"paid_time\": \"2017-1-2\",\n" +
				"            \"paid_money\": \"22\",\n" +
				"            \"remark\": \"还款\"\n" +
				"        }\n" +
				"    }\n" +
				"}";*/

	/*	String debtContent=
		"{\n" +
		"    \"op\": {\n" +
		"        \"overdue\": {\n" +
		"            \"overdue_start_time\": \"2017-1-2\",\n" +
		"            \"payment_leve\": \"1\",\n" +
		"            \"overdue_reason\": \"1\",\n" +
		"            \"overdue_status_mark\": \"q\"\n" +
		"        }\n" +
		"    }\n" +
		"}";*/
		//测试还款
		String debtContent="{\n" +
				"    \"op\": {\n" +
				"        \"repayment\": {\n" +
				"            \"paid_time\": \"2017-1-2\",\n" +
				"            \"paid_money\": 22,\n" +
				"            \"remark\": \"还款\"\n" +
				"        }\n" +
				"    }\n" +
				"}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("key", "456");
		params.put("sign",MD5.process("456" + "up" + "1" + "1.0" + "qjc" + "361111719877777" + "qwe23123" + "444"));
		params.put("cmd", "up");
		params.put("isgetreport", "1");
		params.put("version", "1.0");
		params.put("data", debtContent);
		
		params.put("name", "qjc");
		params.put("cardid", "361111719877777");
		params.put("crid", "qwe23123");
		PageFetcher pf = new PageFetcher();
        
		System.out.println(pf.dopost(url, params));
   }
   //测试催收
   @Test
   public void collect() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String url = "http://localhost:8080/CISP/CISPApi/pushLoanInfo.action";    
		String content="{\n" +
				"    \"overdue_info\": {\n" +
				"        \"overdue_start_time\": \"2016-01-12\",\n" +
				"        \"overdue_duration\": \"1\",\n" +
				"        \"overdue_reason\": \"2\",\n" +
				"        \"overdue_status\": \"2\"\n" +
				"    }\n" +
				"}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("key", "123456");
		params.put("sign", MD5.process("123456" + "over" + "1" + "1.0" + "kkk" + "362227198207090017" + "111" + "23423"));
		params.put("cmd", "over");
		params.put("isgetreport", "1");
		params.put("version", "1.0");
		params.put("name", "kkk");
		params.put("cardid", "362227198207090017");
		params.put("crid", "111");
		params.put("data", content);
		PageFetcher pf = new PageFetcher();
		System.out.println(pf.dopost(url, params));
   }
   
   //测试存量
   @Test
   public void con() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String url = "http://localhost:8080/CISP/CISPApi/pushLoanInfo";    
		/*String content="{\n" +
				"	\"loan_info\":{\n" +
				"		\"contract_money\":\"2000\",\n" +
				"		\"contract_start_time\":\"2016-01-12\",\n" +
				"		\"contract_end_time\":\"2016-01-12\",\n" +
				"		\"loan_type\":\"1\",\n" +
				"		\"loan_guarantee_type\":\"1\",\n" +
				"		\"pay_period\":\"12\",\n" +
				"		\"pay_location\":\"1100\"\n" +
				"	},\n" +
				"	\"op\": {\n" +
				"    \"loan_info\":{\n" +
				"     \"last_time_paid\":\"2016-01-12\",\n" +
				"		\"unpaid_money\":\"100\",\n" +
				"		\"current_bill_money\":\"200\"\n" +
				"       }\n" +
				"	}\n" +
				"}";
		
		
		Map<String, String> params = new HashMap<String, String>();
		
		params.put("key", "123456");
		params.put("sign", MD5.process("123456" + "stock" + "1" + "1.0" + "kkk" + "362227198207090017" + "111" + "23423"));
		params.put("cmd", "stock");
		params.put("isgetreport", "1");
		params.put("version", "1.0");
		params.put("name", "kkk");
		params.put("cardid", "362227198207090017");
		params.put("crid", "111");
		params.put("data", content);
		PageFetcher pf = new PageFetcher();
		System.out.println(pf.dopost(url, params));*/
		
		String stockLoanContent = "{\n" +
				"    \"loan_info\": {\n" +
				"        \"contract_money\": \"2000\",\n" +
				"        \"contract_start_time\": \"2016-01-12\",\n" +
				"        \"contract_end_time\": \"2016-01-12\",\n" +
				"        \"loan_type\": \"1\",\n" +
				"        \"loan_guarantee_type\": \"1\",\n" +
				"        \"pay_period\": \"12\",\n" +
				"        \"pay_location\": \"1100\"\n" +
				"    },\n" +
				"    \"op\": {\n" +
				"        \"overdue_info\": {\n" +
				"            \"overdue_start_time\": \"2016-01-12\",\n" +
				"            \"overdue_duration\": \"1\",\n" +
				"            \"overdue_reason\": \"2\",\n" +
				"            \"overdue_status\": \"2\"\n" +
				"        }\n" +
				"    }\n" +
				"}";

		Map<String, String> params = new HashMap<String, String>();

		String key = "1234567";
		String cmd = "stock";
		String isgetreport = "1";
		String version = "1.0";
		String name = "testbegin";
		String cardid = "120224198407184418";
		String crid = "2016093163";
		String private_key = "456";

		String signature = key + cmd + isgetreport + version + name + cardid + crid + private_key;
		String sign = MD5.process(signature);

		params.put("key", key);
		params.put("sign", sign);
		params.put("cmd", cmd);
		params.put("isgetreport", isgetreport);
		params.put("version", version);
		params.put("data", stockLoanContent);
		params.put("name", name);
		params.put("cardid", cardid);
		params.put("crid", crid);

		PageFetcher pf = new PageFetcher();
		System.out.println(pf.dopost(url, params));
   }
   @Test
   public void pressmd5() throws NoSuchAlgorithmException, UnsupportedEncodingException{
	       String key="123456";   String cmd="up";   String isgetreport="1";   String version="1.0";   
	       String name="kkk"; String  cardid="362227198207090017" ; String contract_id="111";
	       String signature = key + cmd + isgetreport + version + name + cardid + contract_id+"456";
           String str=MD5.process(signature);
       	   System.out.println(str);
           
   }
   
  /*@Test 
  public void testCheck(){
    boolean b=  CheckSignUtil.check("","nn", "g", "1", "1.0", "", "", "", "");
	
	System.out.println(b);
	
  }*/
   
   @Test
   public void inven() throws JSONException{
	  String data="{\n" +
			  "    \"loan_info\": {\n" +
			  "        \"contract_money\": \"2000\",\n" +
			  "        \"contract_start_time\": \"2016-01-12\",\n" +
			  "        \"contract_end_time\": \"2016-01-12\",\n" +
			  "        \"loan_type\": \"1\",\n" +
			  "        \"loan_guarantee_type\": \"1\",\n" +
			  "        \"pay_period\": 12,\n" +
			  "        \"pay_location\": \"1100\"\n" +
			  "    },\n" +
			  "    \"op\": {\n" +
			  "        \"overdue_info\": {\n" +
			  "            \"overdue_start_time\": \"2016-01-12\",\n" +
			  "            \"overdue_duration\": \"1\",\n" +
			  "            \"overdue_reason\": \"2\",\n" +
			  "            \"overdue_status\": \"2\"\n" +
			  "        }\n" +
			  "    }\n" +
			  "}";
	  JSONObject jsonobj=new JSONObject(data);
	  JSONObject json1= jsonobj.getJSONObject("loan_info");
	  JSONObject json2= jsonobj.getJSONObject("op"); 
	  String contract_money=   (String) json1.get("contract_money");
	  System.out.println(contract_money);
	  String str=null;
	  Iterator<String> keys = json2.keys();
	 while( keys.hasNext()){
		str=keys.next(); 
	 }
	 
	 System.out.println(str+"=========");
   }
   
   
   
}
