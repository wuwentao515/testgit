package com.sinoway.cisp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.List;
import java.util.UUID;

//import com.sinoway.cisp.dao.LoanApplicationMapper;
//import com.sinoway.cisp.entitys.LoanApplication;
//import com.sinoway.cisp.entitys.LoanApplicationExample;
//import com.sinoway.cisp.entitys.User;


public class IDUtil {
	
	public static String getSinoId(String instiCode, String funCode){
		StringBuffer tmp = new StringBuffer();
		tmp.append("SINOWAY-");//我司代码固定为SINOWAY
		tmp.append(funCode+"-");
		tmp.append(instiCode+"-");
		tmp.append(timeId()+"-");
		tmp.append(generateShortUuid().substring(0, 8));
		
		return tmp.toString();
	}
	
	/*
	 * type:
	 *   功能码的定义：
	 *     查询编码，对应功能码为Q；
	 *     进件/债权的ID编码，对应功能码为S；
	 *     黑名单的数据，对应功能码为D。
	 */
	/*public String getSinoId(LoanApplicationMapper loanApplicationMapper, User user, String type){
		StringBuffer tmp = new StringBuffer();
		tmp.append("SINOWAY-");//我司代码固定为SINOWAY
		tmp.append(type+"-");
		tmp.append(user.getInstiCode()+"-");
		tmp.append(timeId()+"-");
		if("Q".equals(type)){
			tmp.append(generateShortUuid().substring(0, 8));
		}else if("D".equals(type)){
			tmp.append(generateShortUuid().substring(0, 8));
		}else{
			tmp.append(findMaxSinoidString(loanApplicationMapper, user));
		}
		tmp.append(generateShortUuid().substring(0, 8));
		
		return tmp.toString();
	}
	*/

	public static String generateShortUuid() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);

			shortBuffer.append(x);
		}
		return shortBuffer.toString();

	}



	/*private String findMaxSinoidString(LoanApplicationMapper loanApplicationMapper, User user) {
		String serialNumber = "00000001";

		Long maxSinoidLong = Long.parseLong(serialNumber);
		// 创建loanApplicationExample对象
		LoanApplicationExample loanApplicationExample = new LoanApplicationExample();
		com.sinoway.cisp.entitys.LoanApplicationExample.Criteria loanApplicationCriteria = loanApplicationExample
				.createCriteria();
		loanApplicationCriteria.andSinoidIsNotNull();
		List<LoanApplication> loanApplicationList = loanApplicationMapper.selectByExample(loanApplicationExample);
		String loanApplicationSinoid = null;
		if (loanApplicationList.size() > 0) {
			// 获取最后一条进件的sinoid
			loanApplicationSinoid = loanApplicationList.get(loanApplicationList.size() - 1).getSinoid();
			// 截取流水号
			String subSinoid = loanApplicationSinoid.substring(20 + user.getInstiCode().toString().length(),
					loanApplicationSinoid.length());
			Long subSinoidLong = Long.parseLong(subSinoid);// 把流水号转换成Long类型
			// 找出最大值
			if (subSinoidLong > maxSinoidLong) {
				maxSinoidLong = subSinoidLong;
			}
			maxSinoidLong = maxSinoidLong + 1;
		}

		String maxSinoidString = maxSinoidLong.toString();
		int m = 8 - maxSinoidString.length();
		// 不足8位补0
		for (int j = 1; j <= m; j++) {
			maxSinoidString = "0" + maxSinoidString;
		}
		if (loanApplicationSinoid != null) {
			// 获取最后一个进件的上传时间
			String loanTimeStr = loanApplicationSinoid.substring(11 + user.getInstiCode().toString().length(), 20);
			String nowTimeStr = DateUtils.formatDate(new Date());
			// 判断时间是否改变,如果改变，则流水号更改为00000001
			if (loanTimeStr.compareTo(nowTimeStr) != 0) {
				maxSinoidString = "00000001";
			}
		}
		return maxSinoidString;
	}
*/

	private static String timeId() {
		SimpleDateFormat fr = new SimpleDateFormat("yyyyMMdd");
		String timeid = fr.format(new Date());
		return timeid;
	}
	
}
