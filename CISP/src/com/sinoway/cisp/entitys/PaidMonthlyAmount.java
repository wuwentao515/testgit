package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.Date;

public class PaidMonthlyAmount {
    private String sinoid;

    private Integer paymentnumber;

    private BigDecimal paidMoney;

    private Date paidTime;

    private Date sinotime;

    private String remark;

    public String getSinoid() {
        return sinoid;
    }

    public void setSinoid(String sinoid) {
        this.sinoid = sinoid == null ? null : sinoid.trim();
    }

    public Integer getPaymentnumber() {
        return paymentnumber;
    }

    public void setPaymentnumber(Integer paymentnumber) {
        this.paymentnumber = paymentnumber;
    }

    public BigDecimal getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(BigDecimal paidMoney) {
        this.paidMoney = paidMoney;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}