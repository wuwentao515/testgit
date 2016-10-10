package com.sinoway.cisp.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sinoway.cisp.utils.MD5;
import com.sinoway.cisp.utils.PageFetcher;

public class LRXTest {
	public static void main(String args[]) throws Exception {
		String url = "http://localhost:8080/CISP/CISPApi/pushCreditData.action";

		String content = "{\n" + "    \"loan_info\": {\n" + "        \"pay_location\": \"1100\",\n"
				+ "        \"loan_type\": \"1\",\n" + "        \"loan_guarantee\": \"1\",\n"
				+ "        \"loan_start_time\": \"2016-01-12\",\n" + "        \"phone\": \"13333334444\",\n"
				+ "        \"email\": \"jiaozhijun@hotmail.com\",\n" + "        \"born_location\": \"1100\",\n"
				+ "        \"live_location\": \"1100\"\n" + "    },\n" + "    \"overdue_info\": {\n"
				+ "        \"overdue_times\": 12,\n" + "        \"overdue_start_time\": \"2016-01-12\",\n"
				+ "        \"overdue_money\": 2000,\n" + "        \"overdue_longest_duration\": \"1\",\n"
				+ "        \"overdue_reason\": \"2\",\n" + "        \"overdue_status\": \"2\"\n" + "    }\n" + "}";

		// Map<String, String> params = new HashMap<String, String>();
		// params.put("key", "123456");
		// params.put("sign", MD5.process("123456ww1.0zhangsan12333323423"));
		// params.put("cmd", "over");
		// params.put("isgetreport", "1");
		// params.put("version", "1.0");
		// params.put("data", content);
		// params.put("datatype", "ww");
		// params.put("name", "zhangsan");
		// params.put("cardid", "123333");
		// params.put("instiid", "1111");
		//
		// PageFetcher pf = new PageFetcher();
		// System.out.println(pf.dopost(url, params));

		Map<String, String> params = new HashMap<String, String>();

		String key = "123456";
		String version = "1.0";
		String name = "testbegin12334567";
		String cardid = "120224198407184418";
		String private_key = "23423";
		String datatype = "blacklist";

		String signature = key + datatype + version + name + cardid + private_key;
		String sign = MD5.process(signature);

		params.put("key", key);
		params.put("sign", sign);
		params.put("datatype", datatype);
		params.put("version", version);
		params.put("data", content);
		params.put("name", name);
		params.put("cardid", cardid);

		PageFetcher pf = new PageFetcher();

		String response = pf.dopost(url, params);

	}

	@Test
	public void test() throws Exception {

		String process = MD5.process("");

		String url = "http://localhost:8080/CISP/CISPApi/getCreditData.action";

		String key = "123456";
		String version = "1.0";
		String name = "testbegin12334567";
		String cardid = "120224198407184418";
		String private_key = "23423";
		String datatype = "blacklist";

		String signature = key + datatype + version + name + cardid + private_key;
		String sign = MD5.process(signature);

		Map<String, String> params = new HashMap<String, String>();

		params.put("key", key);
		params.put("sign", sign);
		params.put("datatype", datatype);
		params.put("version", version);
		params.put("name", name);
		params.put("cardid", cardid);
		PageFetcher pf = new PageFetcher();
		System.out.println(process);
		System.out.println(pf.dopost(url, params));
	}

}
