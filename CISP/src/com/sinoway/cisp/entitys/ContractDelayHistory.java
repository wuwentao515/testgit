package com.sinoway.cisp.entitys;

import java.util.Date;

public class ContractDelayHistory extends ContractDelayHistoryKey {
    private Date sinotime;

    public Date getSinotime() {
        return sinotime;
    }

    public void setSinotime(Date sinotime) {
        this.sinotime = sinotime;
    }
}