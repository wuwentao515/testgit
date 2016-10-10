package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.ExtendTimeMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.OverdueStatusMapper;
import com.sinoway.cisp.dao.PaidMonthlyAmountMapper;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample.Criteria;
import com.sinoway.cisp.entitys.ExtendTime;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.OverdueStatus;
import com.sinoway.cisp.entitys.OverdueStatusExample;
import com.sinoway.cisp.entitys.PaidMonthlyAmount;
import com.sinoway.cisp.entitys.PaidMonthlyAmountExample;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;

@Component("debtService")
public class DebtServiceImpl implements CispBasicApiService {

	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;
	@Autowired
	private PaidMonthlyAmountMapper paidMonthlyAmountMapper;

	@Autowired
	private ExtendTimeMapper extendTimeMapper;

	@Autowired
	private OverdueStatusMapper overdueStatusMapper;
	@Autowired
	private IdMapperMapper idMapperMapper;

	@Autowired
	private ReportService reportService;
	@Autowired
	private SearchService searchService;
	@Autowired
	private ResponseJsonService responseJsonService;

	PaidMonthlyAmount paids = new PaidMonthlyAmount();

	ContractAcceptDetail con = new ContractAcceptDetail();

	ExtendTime extendTime = new ExtendTime();

	OverdueStatus over = new OverdueStatus();
	IdMapper idMapper = new IdMapper();

	@Override
	public String pushLoanInfo(User user, String cmd, String isgetreport, String version, String name, String cardid,
			String crid, String data) {
		Date d1 = new Date();
		String result = null;
		String errorCode = null;
		ContractAcceptDetailExample example = new ContractAcceptDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andContractIdEqualTo(crid);
		List<ContractAcceptDetail> list = contractAcceptDetailMapper.selectByExample(example);
		// 进行判断合同号是否为空
		if (CollectionUtils.isNotEmpty(list)) {
			// 得到sinoid
			String sinoid = list.get(0).getSinoid();
			// 进行解析json
			try {
				JSONObject jsonobject = new JSONObject(data);
				JSONObject json = jsonobject.getJSONObject("op");
				Iterator<String> iterator = json.keys();
				String d = null;
				while (iterator.hasNext()) {
					d = (String) iterator.next();
				}
				JSONObject j = json.getJSONObject(d);

				if ("repayment".equals(d)) {

					PaidMonthlyAmountExample example1 = new PaidMonthlyAmountExample();
					com.sinoway.cisp.entitys.PaidMonthlyAmountExample.Criteria cri = example1.createCriteria();
					cri.andSinoidEqualTo(sinoid);
					cri.andPaidMoneyIsNotNull();
					List<PaidMonthlyAmount> list1 = paidMonthlyAmountMapper.selectByExample(example1);
					if (list1 == null || list1.size() == 0) {
						String paid_time = (String) j.get("paid_time");
						String paid_money = (String) j.getString("paid_money");
						String remark = (String) j.get("remark");

						paids.setPaidTime(DateUtils.parseDate(paid_time));
						//
						paids.setPaymentnumber(1);// 需要进行判断
						paids.setPaidMoney(new BigDecimal(paid_money));
						paids.setRemark(remark);
						paids.setSinoid(sinoid);

						paids.setSinotime(d1);
						int i = paidMonthlyAmountMapper.insertSelective(paids);
						if (i < 0) {
							// 数据插入错误
							errorCode = "1005";
							// result =ResponseJsonUtils.creaRespJson(false,
							// errorCode, null);
							result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);
						} else {
							// 更新idmapper状态

							/*
							 * idMapper.setSinoid(sinoid);
							 * idMapper.setCrStatus("23");
							 * idMapper.setSinotime(new Date());
							 * idMapperMapper.updateByPrimaryKeySelective(
							 * idMapper);
							 */
							IdMapper selectByPrimaryKey = idMapperMapper.selectByPrimaryKey(sinoid);
							selectByPrimaryKey.setCrStatus("23");
							selectByPrimaryKey.setSinotime(d1);

							idMapperMapper.updateByPrimaryKey(selectByPrimaryKey);

							if ("1".equals(isgetreport)) {
								try {
									searchService.insSearchReport(user, sinoid, "2", null, d1, name, cardid,
											d1);
									List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
									result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
											report.get(0));

								} catch (Exception e) {

									e.printStackTrace();
									// 返回报告错误
									errorCode = "1102";
									// result
									// =ResponseJsonUtils.creaRespJson(false,
									// errorCode, null);
									result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
											null);
								}
							}
						}

					} else {
						// 期数加一
						PaidMonthlyAmount p = list1.get(list1.size() - 1);
						int paymentnumber = p.getPaymentnumber();
						String paid_time = (String) j.get("paid_time");
						String paid_money = (String) j.getString("paid_money");
						String remark = (String) j.get("remark");

						paids.setPaidTime(DateUtils.parseDate(paid_time));
						//
						paids.setPaymentnumber(paymentnumber + 1);// 需要进行判断
						paids.setPaidMoney(new BigDecimal(paid_money));
						paids.setRemark(remark);
						paids.setSinoid(sinoid);
						paids.setSinotime(d1);
						int i = paidMonthlyAmountMapper.insertSelective(paids);

						if (i < 0) {
							// 数据插入错误
							errorCode = "1005";
							// result =ResponseJsonUtils.creaRespJson(false,
							// errorCode, null);
							result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

						} else {

							// result =ResponseJsonUtils.creaRespJson(true,
							// null, null);
							if ("1".equals(isgetreport)) {
								try {

									searchService.insSearchReport(user, sinoid, "2", null, d1, name, cardid,
											d1);
									List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
									System.out.println(report.get(0));
									result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
											report.get(0));
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									// 返回报告错误
									errorCode = "1102";
									// result
									// =ResponseJsonUtils.creaRespJson(false,
									// errorCode, null);
									result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
											null);

								}
							}
						}

					}

				} else if ("settle".equals(d)) {
					// 结清日期
					String settle_time = (String) j.get("settle_time");
					/*
					 * con.setSinoid(sinoid);
					 * con.setSettleTime(DateUtils.parseDate(settle_time)); int
					 * i =
					 * contractAcceptDetailMapper.updateByPrimaryKeySelective(
					 * con);
					 */

					ContractAcceptDetail selectByPrimaryKey = contractAcceptDetailMapper.selectByPrimaryKey(sinoid);
					selectByPrimaryKey.setSettleTime(DateUtils.parseDate(settle_time));
					int i = contractAcceptDetailMapper.updateByPrimaryKey(selectByPrimaryKey);

					if (i < 0) {
						// 数据插入错误
						errorCode = "1005";
						// result =ResponseJsonUtils.creaRespJson(false,
						// errorCode, null);
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

					} else {

						// 修改idMapper的状态
						/*
						 * idMapper.setSinoid(sinoid);
						 * idMapper.setCrStatus("21"); idMapper.setSinotime(new
						 * Date());
						 * idMapperMapper.updateByPrimaryKeySelective(idMapper);
						 */

						IdMapper selectByPrimaryKey1 = idMapperMapper.selectByPrimaryKey(sinoid);
						selectByPrimaryKey1.setCrStatus("21");
						selectByPrimaryKey1.setSinotime(d1);
						idMapperMapper.updateByPrimaryKey(selectByPrimaryKey1);

						// 修改合同同意表的状态
						ContractAcceptDetail selectByPrimaryKey2 = contractAcceptDetailMapper
								.selectByPrimaryKey(sinoid);
						selectByPrimaryKey2.setContractStatus("2");
						selectByPrimaryKey2.setSinotime(d1);
						contractAcceptDetailMapper.updateByPrimaryKey(selectByPrimaryKey2);

						if ("1".equals(isgetreport)) {
							try {

								searchService.insSearchReport(user, sinoid, "2", null, d1, name, cardid, d1);
								List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
								result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
										report.get(0));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								// 返回报告错误
								errorCode = "1102";
								// result =ResponseJsonUtils.creaRespJson(false,
								// errorCode, null);
								result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
										null);

							}
						}
					}

				} else if ("extendible".equals(d)) {
					ExtendTime selectByPrimaryKey3 = extendTimeMapper.selectByPrimaryKey(sinoid);
					if (selectByPrimaryKey3 == null) {
						String extend_limit_time = (String) j.get("extend_limit_time");
						String whole_not_paid = (String) j.get("whole_not_paid");
						extendTime.setExtendLimitTime(DateUtils.parseDate(extend_limit_time));
						extendTime.setWholeNotPaid(new BigDecimal(whole_not_paid));
						extendTime.setSinoid(sinoid);
						extendTime.setSinotime(d1);

						int i = extendTimeMapper.insertSelective(extendTime);

						if (i < 0) {
							// 数据插入错误
							errorCode = "1005";
							// result =ResponseJsonUtils.creaRespJson(false,
							// errorCode, null);
							result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

						} else {
							// 修改idMapper的状态
							/*
							 * idMapper.setSinoid(sinoid);
							 * idMapper.setCrStatus("22");
							 * idMapper.setSinotime(new Date());
							 * idMapperMapper.updateByPrimaryKeySelective(
							 * idMapper);
							 */

							IdMapper selectByPrimaryKey2 = idMapperMapper.selectByPrimaryKey(sinoid);
							selectByPrimaryKey2.setCrStatus("22");
							selectByPrimaryKey2.setSinotime(d1);
							idMapperMapper.updateByPrimaryKey(selectByPrimaryKey2);

							// 修改合同同意表中的状态
							ContractAcceptDetail selectByPrimaryKey = contractAcceptDetailMapper
									.selectByPrimaryKey(sinoid);
							selectByPrimaryKey.setContractStatus("3");
							selectByPrimaryKey.setSinotime(d1);
							contractAcceptDetailMapper.updateByPrimaryKey(selectByPrimaryKey);

							// result =ResponseJsonUtils.creaRespJson(true,
							// null,
							// null);
							if ("1".equals(isgetreport)) {
								try {

									searchService.insSearchReport(user, sinoid, "2", null, d1, name, cardid,
											d1);
									List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
									result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
											report.get(0));
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									// 返回报告错误
									errorCode = "1102";
									// result
									// =ResponseJsonUtils.creaRespJson(false,
									// errorCode, null);
									result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
											null);

								}
							}
						}
					} else {
						//只能展期一次
						errorCode="1112";
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
								null);
					}

				} else if ("overdue".equals(d)) {
					// 进行查询sn
					OverdueStatusExample example1 = new OverdueStatusExample();
					com.sinoway.cisp.entitys.OverdueStatusExample.Criteria createCriteria = example1.createCriteria();
					createCriteria.andSinoidEqualTo(sinoid);
					// 得到所用的OverdueStatus对象
					List<OverdueStatus> list1 = overdueStatusMapper.selectByExample(example1);
					        
					if (list1.size() ==0) {
						
						String overdue_start_time = (String) j.get("overdue_start_time");
						String payment_leve = (String) j.get("payment_leve");
						String overdue_reason = (String) j.get("overdue_reason");
						String overdue_status_mark = (String) j.get("overdue_status_mark");
                        
						
						over.setSinoid(sinoid);
						over.setColSn("1");
						over.setPaymentLevel(Integer.valueOf(payment_leve));
						over.setOverdueStartTime(DateUtils.parseDate(overdue_start_time));
						over.setOverdueReason(overdue_reason);
						over.setOverdueStatusMark(overdue_status_mark);
						over.setSinotime(d1);
						int i = overdueStatusMapper.insert(over);

						if (i < 0) {
							// 数据插入错误
							errorCode = "1005";
							// result =ResponseJsonUtils.creaRespJson(false,
							// errorCode, null);
							result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);
						} else {
							// 更新idmapper状态
							/*
							 * idMapper.setSinoid(sinoid);
							 * idMapper.setCrStatus("23");
							 * idMapper.setSinotime(new Date());
							 * idMapperMapper.updateByPrimaryKeySelective(
							 * idMapper);
							 */
							// 将逾期表中的状态插入到数据中

							IdMapper selectByPrimaryKey1 = idMapperMapper.selectByPrimaryKey(sinoid);
							idMapper.setCrStatus(overdue_status_mark);
							idMapper.setSinotime(d1);
							idMapperMapper.updateByPrimaryKey(selectByPrimaryKey1);

							// 修改合同同意表中的状态
							ContractAcceptDetail selectByPrimaryKey = contractAcceptDetailMapper
									.selectByPrimaryKey(sinoid);
							selectByPrimaryKey.setContractStatus("4");
							selectByPrimaryKey.setSinotime(d1);
							contractAcceptDetailMapper.updateByPrimaryKey(selectByPrimaryKey);

							if ("1".equals(isgetreport)) {
								try {
									searchService.insSearchReport(user, sinoid, "2", null, d1, name, cardid,
											d1);
									List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
									result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
											report.get(0));
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									// 返回报告错误
									errorCode = "1102";
									// result
									// =ResponseJsonUtils.creaRespJson(false,
									// errorCode, null);
									result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
											null);

								}
							}
						}
					}else {
						// 已经逾期 可以进行催收
						errorCode = "1104";
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

					}
				} else {
					// 请选择一个
					errorCode = "1105";
					result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				// TODO Auto-generated catch block
				// json解析错误
				errorCode = "1004";
				// result =ResponseJsonUtils.creaRespJson(false, errorCode,
				// null);
				result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

			}

		} else {
			// 没有找到合同号
			errorCode = "1101";
			// result =ResponseJsonUtils.creaRespJson(false, errorCode, null);
			result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);
		}
		// }
		return result;
	}

}
