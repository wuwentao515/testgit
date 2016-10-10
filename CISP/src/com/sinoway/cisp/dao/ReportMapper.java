package com.sinoway.cisp.dao;

import java.util.List;

import com.sinoway.cisp.entitys.LoanApplication;

public interface ReportMapper {
	/*
	 * 最近六个月所有申请
	 */
	List<LoanApplication> selectSixMonth(String cardid);

	/*
	 * 参数cardid 返回contract_accept实体
	 */
	List<LoanApplication> selectContract(String cardid);

	/*
	 * 参数sinoid contract_accept 最近六个月所有申请通过。
	 */
	List<LoanApplication> selectContrac1t(String cardid);

	// 正常结清
	int zsettle(String s);

	// int zsettle(Map map);
	// 正常未清
	int zoutstanding(String s);

	// 近6个月待审
	int trial(String s);

	// 近6个月通过
	int pass(String s);

	// 近6个月未通过
	int upass(String s);

	// 近6个月取消
	int cancel(String s);

	// 异常结清
	int ysettle(String s);

	// 异常未清
	int youtstanding(String s);

	// 近两年的查询纪录
	int serchHis(String s);

}
