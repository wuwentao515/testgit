package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.Date;

public class Inventory {
    private String sinoid;

    private Date paymentDate;

    private BigDecimal notRepayMoney;

    private BigDecimal currentMoney;

    private Date sinotime;

    public String getSinoid() {
        return sinoid;
    }

    public void setSinoid(String sinoid) {
        this.sinoid = sinoid == null ? null : sinoid.trim();
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getNotRepayMoney() {
        return notRepayMoney;
    }

    public void setNotRepayMoney(BigDecimal notRepayMoney) {
        this.notRepayMoney = notRepayMoney;
    }

    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(BigDecimal currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }
}