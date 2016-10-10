package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.Date;

public class ExtendTime {
    private String sinoid;

    private Date extendLimitTime;

    private BigDecimal wholeNotPaid;

    private Date sinotime;

    public String getSinoid() {
        return sinoid;
    }

    public void setSinoid(String sinoid) {
        this.sinoid = sinoid == null ? null : sinoid.trim();
    }

    public Date getExtendLimitTime() {
        return extendLimitTime;
    }

    public void setExtendLimitTime(Date extendLimitTime) {
        this.extendLimitTime = extendLimitTime;
    }

    public BigDecimal getWholeNotPaid() {
        return wholeNotPaid;
    }

    public void setWholeNotPaid(BigDecimal wholeNotPaid) {
        this.wholeNotPaid = wholeNotPaid;
    }

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }
}