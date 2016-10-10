package com.sinoway.cisp.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.entitys.ApplyDetail;
import com.sinoway.cisp.entitys.Dissent;

import com.sinoway.cisp.entitys.TransactionsDetail;
import com.sinoway.cisp.entitys.TwoYearSearchDetail;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.ReportDetailService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.StatisticService;
import com.sinoway.cisp.utils.IDUtil;
import com.sinoway.cisp.utils.JsonUtils;




@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private StatisticService statisticService;
	@Autowired
	private ReportDetailService reportDetailService;
	@Autowired
	private IdMapperMapper idMapperMapper;
	@Override
	public List<String> getReport(String cardid,User user) throws Exception {
		// TODO Auto-generated method stub
		List<String> report = new ArrayList<String>();
		
		Map<String, Object> map = new HashMap<>();
		//组装报告的map
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		String request_time=sdf.format(new Date());
		new IDUtil();
		String report_id=IDUtil.getSinoId(user.getInstiCode().toString(), "Q");
		Map<String, Object> personal_info=new HashMap<>();
		String name=null;
		try {
			name = idMapperMapper.getNameByCardid(cardid).getName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("idmapper为空");
		}
	    
		String cardid1=cardid;
		
		personal_info.put("name", name);
		personal_info.put("cardid", cardid1);
		//交易统计
		Map<String, Object> transactions_count=new HashMap<>();
		
		int paid=statisticService.zoutstanding(cardid);//正常还款记录-未清
		int unpaid=statisticService.zsettle(cardid);//正常还款记录-结清
		int un_unpaid=statisticService.youtstanding(cardid);//异常还款记录-结清
		int un_paid=statisticService.ysettle(cardid);//异常还款记录-未清
		int unreviewed=statisticService.trial(cardid);//待审
		int reviewed=statisticService.pass(cardid);//通过
		int refuse=statisticService.upass(cardid);//拒绝
		int cancel=statisticService.cancel(cardid);//取消
		int twoYearsCount=statisticService.serchHis(cardid);//近两年查询记录
		Map<String, Object> normal_pay1=new HashMap<>();
		normal_pay1.put("paid", paid);
		normal_pay1.put("unpaid", unpaid);
		Map<String, Object> unnormal_pay=new HashMap<>();
		unnormal_pay.put("paid", un_paid);
		unnormal_pay.put("unpaid", un_unpaid);
		Map<String, Object> last_6Month_apply_history=new HashMap<>();
		last_6Month_apply_history.put("unreviewed", unreviewed);
		last_6Month_apply_history.put("reviewed", reviewed);
		last_6Month_apply_history.put("refuse", refuse);
		last_6Month_apply_history.put("cancel", cancel);
		
		transactions_count.put("normal_pay", normal_pay1);
		transactions_count.put("unnormal_pay", unnormal_pay);
		transactions_count.put("last_6Month_apply_history", last_6Month_apply_history);
		transactions_count.put("last_2years_history", twoYearsCount);
		//6个月贷款申请记录明细
		List<ApplyDetail> apply_history=new ArrayList<>();
		apply_history=reportDetailService.applyHistoryDetail(cardid, user);
		//交易记录明细
		List<TransactionsDetail> transactions=new ArrayList<>();
		transactions=reportDetailService.transactionsHistoryDetail(cardid, user);
		//近两年内查询记录明细
		List<TwoYearSearchDetail> last_2years_history_detail=new ArrayList<>();
		last_2years_history_detail=reportDetailService.Last2yearsSearchDetail(cardid, user);
		//本人异议申诉明细
		List<Dissent> dissent=new ArrayList<>();
		dissent=reportDetailService.getDissents(cardid);
		
		//把所有模块put到报告map里面
		map.put("request_time", request_time);
		map.put("report_id", report_id);
		map.put("personal_info", personal_info);
		
		map.put("transactions_count", transactions_count);
		map.put("apply_history", apply_history);
		if(0==transactions.size()){
			System.out.println("没有交易记录");
		}else{
			map.put("transactions", transactions);
		}
		
		map.put("last_2years_history", last_2years_history_detail);
		if(0==dissent.size()){
			System.out.println("没有异议申请记录");
		}else{
			map.put("dissent", dissent);
		}
		String map1=JsonUtils.objectToJson(map);
		
		report.add(map1);
		report.add("QRWE-F-G-0001");
		report.add("path/to/report/QRWE-F-G-0001.pdf");
		return report;
		
	}
	
	
}
