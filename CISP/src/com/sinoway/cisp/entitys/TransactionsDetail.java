package com.sinoway.cisp.entitys;

import java.util.List;

public class TransactionsDetail {

	private double contractSum;

	private String startTime;

	private String stopTime;

	private String contractType;

	private String guaraType;

	private String payPeriod;

	private String payLocation;

	private String contractStatus;

	private String dataFrom;

	private String paidMonthlyList;//还款记录：很多的N

	private List<OverdueDetail> overdueStatusList;//关于逾期的原因
	
	 
	
	
	public TransactionsDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionsDetail(double contractSum, String startTime, String stopTime, String contractType, String guaraType,
			String payPeriod, String payLocation, String contractStatus, String dataFrom, String paidMonthlyList) {
		super();
		this.contractSum = contractSum;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.contractType = contractType;
		this.guaraType = guaraType;
		this.payPeriod = payPeriod;
		this.payLocation = payLocation;
		this.contractStatus = contractStatus;
		this.dataFrom = dataFrom;
		this.paidMonthlyList = paidMonthlyList;
	}

	public double getContractSum() {
		return contractSum;
	}

	public void setContractSum(Integer contractSum) {
		this.contractSum = contractSum;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getGuaraType() {
		return guaraType;
	}

	public void setGuaraType(String guaraType) {
		this.guaraType = guaraType;
	}

	public String getPayPeriod() {
		return payPeriod;
	}

	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}

	public String getPayLocation() {
		return payLocation;
	}

	public void setPayLocation(String payLocation) {
		this.payLocation = payLocation;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getDataFrom() {
		return dataFrom;
	}

	public void setDataFrom(String dataFrom) {
		this.dataFrom = dataFrom;
	}

	public String getPaidMonthlyList() {
		return paidMonthlyList;
	}

	public void setPaidMonthlyList(String paidMonthlyList) {
		this.paidMonthlyList = paidMonthlyList;
	}

	public List<OverdueDetail> getOverdueStatusList() {
		return overdueStatusList;
	}

	public void setOverdueStatusList(List<OverdueDetail> overdueStatusList) {
		this.overdueStatusList = overdueStatusList;
	}
	
	
}
