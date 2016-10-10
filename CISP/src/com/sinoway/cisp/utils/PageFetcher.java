package com.sinoway.cisp.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * 使用httpclient获取网页内容
 * 
 * @author DragonWu
 * 
 */
public class PageFetcher {
	private static final Logger Log = Logger.getLogger(PageFetcher.class
			.getName());
	private HttpClient client;
	private static final String APPLICATION_JSON = "application/json";

	private static final String CONTENT_TYPE_TEXT_JSON = "text/json";

	/**
	 * 创建HttpClient实例，并初始化连接参数
	 */
	public PageFetcher() {
		HttpParams params = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(params, 100 * 1000);
		HttpConnectionParams.setSoTimeout(params, 120 * 1000);
		client = new DefaultHttpClient(params);
	}

	/**
	 * 主动关闭HttpClient连接
	 */
	public void close() {
		client.getConnectionManager().shutdown();
	}

	/**
	 * 通过get方法获取网页内容
	 * 
	 * @param url
	 * @return
	 */
	public String doget(String url) {
		String content = null;
		int statusCode = 500;
		// 创建Get请求，并设置Header
		HttpGet getHttp = new HttpGet(url);
		getHttp.setHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; rv:16.0) Gecko/20100101 Firefox/16.0");
		HttpResponse response;
		try {
			response = client.execute(getHttp);
			statusCode = response.getStatusLine().getStatusCode();

			HttpEntity entity = response.getEntity();
			if (statusCode == 200) {
				content = EntityUtils.toString(entity, "utf-8");
			}
			return content;
		} catch (Exception e) {
			e.printStackTrace();
			return content;
		}
	}

	/**
	 * 通过post方法获取内容
	 * 
	 * @param url
	 * @param params
	 * @return
	 */
	public String dopost(String url, Map<String, String> params) {
		int statusCode = 500;
		String content = null;
		HttpPost httpost = new HttpPost(url);
		HttpResponse response;
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}
		httpost.setHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; rv:16.0) Gecko/20100101 Firefox/16.0");
		try {
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			// httpost.addHeader("Content-Type", "text/html;charset=UTF-8");
			response = client.execute(httpost);
			statusCode = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			if (statusCode == 200) {
				content = EntityUtils.toString(entity, "UTF-8");
			}
			return content;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String dopostByJson(String url, String jsoncontent)
			throws UnsupportedEncodingException {
		int statusCode = 500;
		String content = null;
		HttpPost httpost = new HttpPost(url);
		HttpResponse response;
		String encoderJson = URLEncoder.encode(jsoncontent, HTTP.UTF_8);
		httpost.setHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; rv:16.0) Gecko/20100101 Firefox/16.0");
		try {

			httpost.addHeader("Content-Type", "application/json;charset=UTF-8");
			StringEntity se = new StringEntity(encoderJson);
			se.setContentType(CONTENT_TYPE_TEXT_JSON);
			se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
					APPLICATION_JSON));
			httpost.setEntity(se);
			response = client.execute(httpost);
			statusCode = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			if (statusCode == 200) {
				content = EntityUtils.toString(entity, "UTF-8");
			}
			return content;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public String dopostByJson2(String url, String jsoncontent)
			throws UnsupportedEncodingException {
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost httpPost = new HttpPost(url);
			StringEntity se = new StringEntity(jsoncontent, "utf-8");
			httpPost.addHeader("Content-Type", "text/xml");
			httpPost.setEntity(se);
			HttpResponse response = httpClient.execute(httpPost);
			String content = "";
			if (response.getStatusLine().getStatusCode() == 200) {
				content = EntityUtils.toString(response.getEntity(), "UTF-8");
			}
			System.out.println(content);
			return content;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static String sendPostMethod(String path, String xml, String encoding) {
		String result = "";
		try {
			HttpClient httpClient = new DefaultHttpClient();
			HttpPost httpPost = new HttpPost(path);
			StringEntity myEntity = new StringEntity(xml, encoding);
			httpPost.addHeader("Content-Type", "text/xml");
			httpPost.setEntity(myEntity);
			HttpResponse response = httpClient.execute(httpPost);
			if (response.getStatusLine().getStatusCode() == 200) {
				result = EntityUtils.toString(response.getEntity(), encoding);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
