package com.sinoway.cisp.test;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.junit.Test;

import com.sinoway.cisp.utils.MD5;

public class ALITest {

	@Test
	public void pushLoanInfo() throws Exception {
		String url = "https://cispapi.sinowaycredit.com/CISP/CISPApi/pushLoanInfo";
		// 运行以下代码提交接口请求
		String content = "{\n" + "        \"basic_info\": {\n" + "            \"cell_phone_num\": \"18693152204\",\n"
				+ "            \"edu\": \"1\"\n" + "        },\n" + "        \"loan_info\": {\n"
				+ "            \"request_location\": \"1100\",\n" + "            \"request_type\": \"1\",\n"
				+ "            \"request_money\": 20000.55,\n" + "            \"request_time\": \"2016-08-31\"\n"
				+ "        }\n" + "}";

		String key = "yuhaifeng";
		String cmd = "loan";
		String isgetreport = "1";
		String version = "1.0";
		String data = content;
		String name = "testbegin12334567";
		String cardid = "120224198407184418";
		String crid = "201990921";
		String user_private = "yuhaifeng";
		String sign = MD5.process(key + cmd + isgetreport + version + name + cardid + crid + user_private);

		HttpClient client = new HttpClient();

		PostMethod postmethod = new PostMethod(url); // url对应以上生成的url地址

		HttpMethodParams params = postmethod.getParams(); //
		params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");

		postmethod.addParameter("key", key);
		postmethod.addParameter("sign", sign);
		postmethod.addParameter("cmd", cmd);
		postmethod.addParameter("isgetreport", isgetreport);
		postmethod.addParameter("version", version);
		postmethod.addParameter("data", data);
		postmethod.addParameter("name", name);
		postmethod.addParameter("cardid", cardid);
		postmethod.addParameter("crid", crid);

		client.executeMethod(postmethod);

		// 返回报告的json信息
		String res = new String(postmethod.getResponseBodyAsString());

		System.out.println(res);

		// 释放连接
		postmethod.releaseConnection();
	}

	@Test
	public void pushCreditData() throws Exception {
		String url = "https://cispapi.sinowaycredit.com/CISP/CISPApi/pushCreditData";

		String content = "{\n" + "    \"loan_info\": {\n" + "        \"pay_location\": \"1100\",\n"
				+ "        \"loan_type\": \"1\",\n" + "        \"loan_guarantee\": \"1\",\n"
				+ "        \"loan_start_time\": \"2016-01-12\",\n" + "        \"phone\": \"13333334444\",\n"
				+ "        \"email\": \"jiaozhijun@hotmail.com\",\n" + "        \"born_location\": \"1100\",\n"
				+ "        \"live_location\": \"1100\"\n" + "    },\n" + "    \"overdue_info\": {\n"
				+ "        \"overdue_times\": 12,\n" + "        \"overdue_start_time\": \"2016-01-12\",\n"
				+ "        \"overdue_money\": 2000,\n" + "        \"overdue_longest_duration\": \"1\",\n"
				+ "        \"overdue_reason\": \"2\",\n" + "        \"overdue_status\": \"2\"\n" + "    }\n" + "}";

		String key = "cashbus";
		String version = "1.0";
		String name = "aaaaa";
		String cardid = "11111111111111";
		String private_key = "cashbus";
		String datatype = "blacklist";

		String sign = MD5.process(key + datatype + version + name + cardid + private_key);

		HttpClient client = new HttpClient();

		PostMethod postmethod = new PostMethod(url); // url对应以上生成的url地址

		HttpMethodParams params = postmethod.getParams(); //
		params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");

		postmethod.addParameter("key", key);
		postmethod.addParameter("sign", sign);
		postmethod.addParameter("datatype", datatype);
		postmethod.addParameter("version", version);
		postmethod.addParameter("data", content);
		postmethod.addParameter("name", name);
		postmethod.addParameter("cardid", cardid);

		client.executeMethod(postmethod);

		// 返回报告的json信息
		String res = new String(postmethod.getResponseBodyAsString());

		System.out.println(res);

		// 释放连接
		postmethod.releaseConnection();

	}

	@Test
	public void getCreditData() throws Exception {
		String url = "https://cispapi.sinowaycredit.com/CISP/CISPApi/getCreditData";

		String key = "cashbus";
		String version = "1.0";
		String name = "aaaaa";
		String cardid = "11111111111111";
		String private_key = "cashbus";
		String datatype = "blacklist";
		String qreason = "10";

		String sign = MD5.process(key + datatype + version + name + cardid + private_key);

		HttpClient client = new HttpClient();

		PostMethod postmethod = new PostMethod(url); // url对应以上生成的url地址

		HttpMethodParams params = postmethod.getParams(); //
		params.setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");

		postmethod.addParameter("key", key);
		postmethod.addParameter("sign", sign);
		postmethod.addParameter("datatype", datatype);
		postmethod.addParameter("version", version);
		postmethod.addParameter("name", name);
		postmethod.addParameter("cardid", cardid);
		postmethod.addParameter("qreason", qreason);

		client.executeMethod(postmethod);

		// 返回报告的json信息
		String res = new String(postmethod.getResponseBodyAsString());

		System.out.println(res);

		// 释放连接
		postmethod.releaseConnection();

	}

}
