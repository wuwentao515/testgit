package com.sinoway.cisp.entitys;

public class InstiDetail {
    private Integer instiCode;

    private Integer instiType;

    private String instiName;

    private String instiShortname;

    private String corporationName;

    private String socialCreditCode;

    private String creditPerson;

    private String generalManager;

    private String registeredAddress;

    private String registeredCapital;

    private Integer zipCode;

    private String instiPhone;

    private String instiLocation;

    private String webUrl;

    private String faxNumber;

    private String accessType;

    public Integer getInstiCode() {
        return instiCode;
    }

    public void setInstiCode(Integer instiCode) {
        this.instiCode = instiCode;
    }

    public Integer getInstiType() {
        return instiType;
    }

    public void setInstiType(Integer instiType) {
        this.instiType = instiType;
    }

    public String getInstiName() {
        return instiName;
    }

    public void setInstiName(String instiName) {
        this.instiName = instiName == null ? null : instiName.trim();
    }

    public String getInstiShortname() {
        return instiShortname;
    }

    public void setInstiShortname(String instiShortname) {
        this.instiShortname = instiShortname == null ? null : instiShortname.trim();
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName == null ? null : corporationName.trim();
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    public String getCreditPerson() {
        return creditPerson;
    }

    public void setCreditPerson(String creditPerson) {
        this.creditPerson = creditPerson == null ? null : creditPerson.trim();
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager == null ? null : generalManager.trim();
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getInstiPhone() {
        return instiPhone;
    }

    public void setInstiPhone(String instiPhone) {
        this.instiPhone = instiPhone == null ? null : instiPhone.trim();
    }

    public String getInstiLocation() {
        return instiLocation;
    }

    public void setInstiLocation(String instiLocation) {
        this.instiLocation = instiLocation == null ? null : instiLocation.trim();
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber == null ? null : faxNumber.trim();
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }
}