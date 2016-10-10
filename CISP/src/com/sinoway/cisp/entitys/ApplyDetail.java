package com.sinoway.cisp.entitys;



/*
 * 近6个月贷款申请记录明细
 */
public class ApplyDetail {
	
	private String apply_time;
	
	private String number_type;
	
	
	private String apply_location;
	
	private String loan_type;
	
	private double apply_money;
	
	private String apply_result;
	
	private String comment;
	
	

	public ApplyDetail(String apply_time, String number_type, String apply_location, String loan_type, double apply_money,
			String apply_result, String comment) {
		super();
		this.apply_time = apply_time;
		this.number_type = number_type;
		this.apply_location = apply_location;
		this.loan_type = loan_type;
		this.apply_money = apply_money;
		this.apply_result = apply_result;
		this.comment = comment;
	}

	public String getApply_time() {
		return apply_time;
	}

	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}

	public String getNumber_type() {
		return number_type;
	}

	public void setNumber_type(String number_type) {
		this.number_type = number_type;
	}

	public String getApply_location() {
		return apply_location;
	}

	public void setApply_location(String apply_location) {
		this.apply_location = apply_location;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public double getApply_money() {
		return apply_money;
	}

	public void setApply_money(Integer apply_money) {
		this.apply_money = apply_money;
	}

	public String getApply_result() {
		return apply_result;
	}

	public void setApply_result(String apply_result) {
		this.apply_result = apply_result;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

}
