package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.Date;

public class ContractAcceptDetail {
    private String sinoid;

    private String contractId;

    private BigDecimal contractSum;

    private Date startTime;

    private Date stopTime;

    private String contractType;

    private String guaraType;

    private String payPeriod;

    private String payLocation;

    private String contractStatus;

    private Date settleTime;

    private Date sinotime;

    public String getSinoid() {
        return sinoid;
    }

    public void setSinoid(String sinoid) {
        this.sinoid = sinoid == null ? null : sinoid.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public BigDecimal getContractSum() {
        return contractSum;
    }

    public void setContractSum(BigDecimal contractSum) {
        this.contractSum = contractSum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getGuaraType() {
        return guaraType;
    }

    public void setGuaraType(String guaraType) {
        this.guaraType = guaraType == null ? null : guaraType.trim();
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod == null ? null : payPeriod.trim();
    }

    public String getPayLocation() {
        return payLocation;
    }

    public void setPayLocation(String payLocation) {
        this.payLocation = payLocation == null ? null : payLocation.trim();
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus == null ? null : contractStatus.trim();
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }
}