package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.LoanApplicationMapper;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.IdMapperExample;
import com.sinoway.cisp.entitys.IdMapperExample.Criteria;
import com.sinoway.cisp.entitys.LoanApplication;
import com.sinoway.cisp.service.CheckEntityService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.TimeUtil;

@Service
public class CheckEntityServiceImpl<T> implements CheckEntityService<T> {

	@Autowired
	private IdMapperMapper idMapperMapper;
	@Autowired
	private LoanApplicationMapper loanApplicationMapper;
	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;

	public String check(IdMapper idMapper, T entity) {
		
		return null;

		/*if (entity.getClass() == LoanApplication.class) {
			
			 * 检验instiid是否重复
			 
			if (idMapper != null) {
				IdMapperExample idMapperExample = new IdMapperExample();
				Criteria idMapperCriteria = idMapperExample.createCriteria();
				idMapperCriteria.andInstiidEqualTo(idMapper.getInstiid());
				List<IdMapper> idMapperList = idMapperMapper.selectByExample(idMapperExample);
				if (idMapperList.size() > 0) {
					return "1103";
				}
			}
			
			 * 检验申请时间：请选择从前6个月开始到至今之间的时间！
			 
			LoanApplication loan = (LoanApplication) entity;
			String nowTimeStr = DateUtils.formatDate2(new Date());
			Date nowTime = DateUtils.parseDate(nowTimeStr);
			String requestTimeStr = DateUtils.formatDate2(loan.getRequestTime());
			Date requestTime = DateUtils.parseDate(requestTimeStr);
			Date sixMonthAgoTime = DateUtils.parseDate(TimeUtil.nowMonth());
			if (loan != null) {
				BigDecimal bd1 = loan.getRequestMoney();
				BigDecimal bd2 = new BigDecimal("100000000.00");
				String pointNum = bd1.subtract(new BigDecimal(bd1.intValue())).toString();
				if (pointNum.length() > 4) {
					return "1110";
				}
				if (bd1.compareTo(bd2) >= 0) {
					return "1109";
				}
				if (requestTime.after(sixMonthAgoTime)
						&& (requestTime.before(nowTime) || requestTimeStr.equals(nowTimeStr))) {
					return null;
				}else{
					return "1104";
				}
			}
		}
		if (entity.getClass() == ContractAcceptDetail.class) {
			LoanApplication loanApplication = loanApplicationMapper.selectByPrimaryKey(idMapper.getSinoid());
			ContractAcceptDetail contractAcceptDetail = (ContractAcceptDetail) entity;
			
			*//**
			 * 验证合同编号是否重复
			 *//*
			ContractAcceptDetailExample example = new ContractAcceptDetailExample();
			com.sinoway.cisp.entitys.ContractAcceptDetailExample.Criteria createCriteria = example.createCriteria();
			createCriteria.andContractIdEqualTo(contractAcceptDetail.getContractId());
			List<ContractAcceptDetail> contractAcceptDetailList = contractAcceptDetailMapper.selectByExample(example);
			if(contractAcceptDetailList.size()>0){
				return "1112";
			}
			
			
			 * 验证合同开始时间：开始时间要大于申请时间，结束时间要大于当前时间！
			 
			if (contractAcceptDetail != null) {
				Date startTime = contractAcceptDetail.getStartTime();
				String startTimeStr = startTime.toString();
				Date stopTime = contractAcceptDetail.getStopTime();
				String stopTimeStr = stopTime.toString();
				String requestTimeStr1 = DateUtils.formatDate2(loanApplication.getRequestTime());
				Date requestTime1 = DateUtils.parseDate(requestTimeStr1);
				String nowTimeStr = DateUtils.formatDate2(new Date());
				Date nowTime = DateUtils.parseDate(nowTimeStr);
				if ((startTime.after(requestTime1) || startTimeStr.equals(requestTimeStr1))
						&& (stopTime.after(nowTime) || stopTimeStr.equals(nowTimeStr))) {
					return null;
				} else {
					return "1107";
				}
			}
		}*/

//		return "1003";
	}
}
