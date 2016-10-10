package com.sinoway.cisp.entitys;

import java.util.Date;

public class DissentDetail {
    private String dissentId;

    private String cardid;

    private Date appealTime;

    private String appealDetail;

    private String status;

    public String getDissentId() {
        return dissentId;
    }

    public void setDissentId(String dissentId) {
        this.dissentId = dissentId == null ? null : dissentId.trim();
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public Date getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(Date appealTime) {
        this.appealTime = appealTime;
    }

    public String getAppealDetail() {
        return appealDetail;
    }

    public void setAppealDetail(String appealDetail) {
        this.appealDetail = appealDetail == null ? null : appealDetail.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}