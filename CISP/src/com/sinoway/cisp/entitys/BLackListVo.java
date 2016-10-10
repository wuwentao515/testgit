package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.Date;

public class BLackListVo {
	private String sinoid;

	private String public_time;
	
    private String overdue_start_time;

    private String loan_location;
    
    private BigDecimal overdue_money;
    
    private String overdue_duration;
    
    private String phone;
    
    private String email;
    
    private String personal_address;
    
    private String live_address;
    
    private String reason;

    private String comment;
    
    private String data_source;

	public String getSinoid() {
		return sinoid;
	}

	public void setSinoid(String sinoid) {
		this.sinoid = sinoid;
	}

	public String getPublic_time() {
		return public_time;
	}

	public void setPublic_time(String public_time) {
		this.public_time = public_time;
	}

	public String getOverdue_start_time() {
		return overdue_start_time;
	}

	public void setOverdue_start_time(String overdue_start_time) {
		this.overdue_start_time = overdue_start_time;
	}

	public String getLoan_location() {
		return loan_location;
	}

	public void setLoan_location(String loan_location) {
		this.loan_location = loan_location;
	}

	public BigDecimal getOverdue_money() {
		return overdue_money;
	}

	public void setOverdue_money(BigDecimal overdue_money) {
		this.overdue_money = overdue_money;
	}

	public String getOverdue_duration() {
		return overdue_duration;
	}

	public void setOverdue_duration(String overdue_duration) {
		this.overdue_duration = overdue_duration;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonal_address() {
		return personal_address;
	}

	public void setPersonal_address(String personal_address) {
		this.personal_address = personal_address;
	}

	

	public String getLive_address() {
		return live_address;
	}

	public void setLive_address(String live_address) {
		this.live_address = live_address;
	}

	public String getData_source() {
		return data_source;
	}

	public void setData_source(String data_source) {
		this.data_source = data_source;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

	
	
	
    
    
   

}
