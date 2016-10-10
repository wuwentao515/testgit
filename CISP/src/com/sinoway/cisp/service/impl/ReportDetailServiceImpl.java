package com.sinoway.cisp.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.DissentDetailMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.InstiDetailMapper;
import com.sinoway.cisp.dao.OverdueStatusMapper;
import com.sinoway.cisp.dao.PaidMonthlyAmountMapper;
import com.sinoway.cisp.dao.ReportMapper;
import com.sinoway.cisp.dao.SearchDetailMapper;
import com.sinoway.cisp.entitys.ApplyDetail;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.Dissent;
import com.sinoway.cisp.entitys.DissentDetail;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.InstiDetail;
import com.sinoway.cisp.entitys.LoanApplication;
import com.sinoway.cisp.entitys.OverdueDetail;
import com.sinoway.cisp.entitys.OverdueStatus;
import com.sinoway.cisp.entitys.PaidMonthlyAmount;
import com.sinoway.cisp.entitys.SearchDetail;
import com.sinoway.cisp.entitys.TransactionsDetail;
import com.sinoway.cisp.entitys.TwoYearSearchDetail;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.ReportDetailService;
@Service
public class ReportDetailServiceImpl implements ReportDetailService {
	
	@Autowired
	private ReportMapper reportMapper;
	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;
	@Autowired
	private OverdueStatusMapper overdueStatusMapper;
	@Autowired
	private SearchDetailMapper searchDetailMapper;
	@Autowired
	private DissentDetailMapper dissentDetailMapper;
	@Autowired
	private IdMapperMapper idMapperMapper;
	@Autowired
	private InstiDetailMapper instiDetailMapper;
	@Autowired
	private PaidMonthlyAmountMapper paidMonthlyAmountMapper;
	
	@Override
	public List<ApplyDetail> applyHistoryDetail(String cardId, User user) {
		// TODO Auto-generated method stub
		List<ApplyDetail> list=new ArrayList<>();
		List<LoanApplication> listAllApplication=reportMapper.selectSixMonth(cardId);
		for (LoanApplication loanApplication : listAllApplication) {
			Date at=loanApplication.getRequestTime();
			 String apply_time=getFormatDate(at);
			 String apply_location=loanApplication.getRequestLocation();
			 String loan_type=loanApplication.getRequestType();
			 double apply_money=loanApplication.getRequestMoney().doubleValue();
			 String apply_result=loanApplication.getRequestResult();
			 String loansinoid=loanApplication.getSinoid();//sinoid
			 String number_type=getInstiType(user);
			 String comment=getRemarker(user, loansinoid);
			 ApplyDetail applydetail=new ApplyDetail(apply_time, number_type, apply_location, loan_type, apply_money, apply_result, comment);
			list.add(applydetail);
		}
		return list;
	}

	@Override
	public List<TransactionsDetail> transactionsHistoryDetail(String cardId, User user) {
		// TODO Auto-generated method stub
		List<TransactionsDetail> listtd=new ArrayList<>();
		//拼装返回对象的数据
		List<ContractAcceptDetail> listcad= contractAcceptDetailMapper.selectByCardid(cardId);
		for (ContractAcceptDetail cad : listcad) {
			
			double contractSum=cad.getContractSum().doubleValue();
			String startTime=getFormatDate(cad.getStartTime());
			String stopTime=getFormatDate(cad.getStopTime());
			String contractType=cad.getContractType();
			String guaraType=cad.getGuaraType();
			String payPeriod=cad.getPayPeriod();
			String payLocation=cad.getPayLocation();
			String contractStatus=cad.getContractStatus();
			String sinoid=cad.getSinoid();
			String dataFrom=getRemarker(user, sinoid);
			List<OverdueDetail> overdueDetailList=new ArrayList<>();
			
			String paidMonthlyList="";
			//根据债券状态
			
			if(contractStatus.equals("1")||contractStatus.equals("3")){
				paidMonthlyList=getStringHis(sinoid);
				
			}
			TransactionsDetail td=new TransactionsDetail(contractSum, startTime, stopTime, contractType, guaraType, payPeriod, payLocation, contractStatus, dataFrom, paidMonthlyList);
			if(contractStatus.equals("4")){
				List<OverdueStatus> overdueStatusList1=overdueStatusMapper.selectByCardid(sinoid);
				for (OverdueStatus overdueStatus : overdueStatusList1) {
					String done_time=getFormatDate(overdueStatus.getSinotime());
					String overdue_time=getFormatDate(overdueStatus.getOverdueStartTime());
					String overdue_level=overdueStatus.getPaymentLevel().toString();
					String overdue_reason=overdueStatus.getOverdueReason();
					String now_status=overdueStatus.getOverdueStatusMark();
					OverdueDetail od=new OverdueDetail(done_time, overdue_time, overdue_level, overdue_reason, now_status);
					overdueDetailList.add(od);
				}
				paidMonthlyList=getStringHis(sinoid);
				td.setOverdueStatusList(overdueDetailList);
			}
			
			listtd.add(td);
		}
		return listtd;
	}

	

	@Override
	public List<TwoYearSearchDetail> Last2yearsSearchDetail(String cardId, User user) {
		// TODO Auto-generated method stub
		 List<SearchDetail> list = searchDetailMapper.selectBycardid(cardId);
		 //展示的list
		 List<TwoYearSearchDetail> listTS=new ArrayList<>();
		for (SearchDetail searchDetail : list) {

			String query_time =getFormatDate( searchDetail.getReqTime());
			// 会员类型
			String useracc = searchDetail.getUserAccount();
			String sinoid = searchDetail.getSinoid();
			String number_type = getInstiType(user);
			String query_type = searchDetail.getReqReason();
			String comment = null;
			try {
				comment = getRemarker(user, sinoid);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				comment = "0";
				e.printStackTrace();
				System.out.println("getRemarker为空");
			}

			TwoYearSearchDetail twoYearSearchDetail = new TwoYearSearchDetail(query_time, number_type, query_type,
					comment);
			listTS.add(twoYearSearchDetail);
		}
		return listTS;
	}

	@Override
	public List<Dissent> getDissents(String cardId) {
		// TODO Auto-generated method stub
		List<DissentDetail> list=dissentDetailMapper.selectBycardid(cardId);
		//传输的json
		List<Dissent> listTS=new ArrayList<>();
		for (DissentDetail dissentDetail : list) {
			String dissent_id=dissentDetail.getDissentId();
			String appeal_time=dissentDetail.getAppealTime().toString();
			String appeal_detail=dissentDetail.getAppealDetail();
			String status=dissentDetail.getStatus();
			Dissent dissent= new Dissent(dissent_id, appeal_time, appeal_detail, status);
			listTS.add(dissent);
		}
		return listTS;
	}
	//utils
	//返回是否是本机构
	public String getRemarker(User user,String sinoid){
		//sinoid 对应的instiid
		IdMapper idMapper =idMapperMapper.selectBysinoid(sinoid);
		String sinoinstiid=idMapper.getInstiCode();
		String icode=user.getInstiCode().toString();
		if(sinoinstiid.equals(icode)){
			return "1";
		}else{
			return "0";
		}
		
		//本机构返回1，非本机构返回0
		
	}
	//返回会员类型
	public String getInstiType(User user){
		String code=user.getInstiCode().toString();
		InstiDetail instiDetail=instiDetailMapper.selectByCode(code);
		String institype=instiDetail.getInstiType().toString();
		//返回会员类型的字典代码
		return institype;
	}
	//return 正常还款记录的月份组成的字符串（）
	private String getStringHis(String sinoid) {
		// TODO Auto-generated method stub
		List<PaidMonthlyAmount> list=paidMonthlyAmountMapper.selectByPrimaryKey(sinoid);
		if(!(null==list)){
			StringBuilder his = new StringBuilder();
			for (PaidMonthlyAmount paidMonthlyAmount : list) {
				his.append(paidMonthlyAmount.getPaymentnumber());
			}
			return his.toString();
		}else{
		return null;
		}
	}
	//
	public String getFormatDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}
