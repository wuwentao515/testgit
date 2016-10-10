package com.sinoway.cisp.entitys;

import java.util.Date;

public class SearchDetail extends SearchDetailKey {
    private String userAccount;

    private String reqReason;

    private String resultAdd;

    private Date reqTime;

    private String name;

    private String cardid;

    private Date sinotime;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getReqReason() {
        return reqReason;
    }

    public void setReqReason(String reqReason) {
        this.reqReason = reqReason == null ? null : reqReason.trim();
    }

    public String getResultAdd() {
        return resultAdd;
    }

    public void setResultAdd(String resultAdd) {
        this.resultAdd = resultAdd == null ? null : resultAdd.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }
}