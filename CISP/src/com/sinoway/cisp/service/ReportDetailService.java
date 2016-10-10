package com.sinoway.cisp.service;

import java.util.List;



import com.sinoway.cisp.entitys.ApplyDetail;
import com.sinoway.cisp.entitys.Dissent;
import com.sinoway.cisp.entitys.TransactionsDetail;
import com.sinoway.cisp.entitys.TwoYearSearchDetail;
import com.sinoway.cisp.entitys.User;

public interface ReportDetailService {
	
	    //最近6个月贷款申请记录明细
		public List<ApplyDetail> applyHistoryDetail(String cardId, User user);
		
		//交易明细
	    public List<TransactionsDetail> transactionsHistoryDetail(String cardId,User user);
		
		//近2年内查询记录明细
		
		public List<TwoYearSearchDetail> Last2yearsSearchDetail(String cardId,User user);
		
		
		//本人异议申诉明细
		public List<Dissent> getDissents(String cardId);
		
		
		
}
