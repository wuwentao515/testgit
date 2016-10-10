package com.sinoway.cisp.entitys;

public class OverdueStatusKey {
    private String colSn;

    private String sinoid;

    public String getColSn() {
        return colSn;
    }

    public void setColSn(String colSn) {
        this.colSn = colSn == null ? null : colSn.trim();
    }

    public String getSinoid() {
        return sinoid;
    }

    public void setSinoid(String sinoid) {
        this.sinoid = sinoid == null ? null : sinoid.trim();
    }
}