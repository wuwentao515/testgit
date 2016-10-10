package com.sinoway.cisp.entitys;

public class IpLimit {
    private String userAccount;

    private Integer instiCode;

    private String accessIp;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Integer getInstiCode() {
        return instiCode;
    }

    public void setInstiCode(Integer instiCode) {
        this.instiCode = instiCode;
    }

    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp == null ? null : accessIp.trim();
    }
}