package com.kurlar.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class Currency {
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "currencyCode")
    private String currencyCode;
    @Column(name = "unit")
    private int unit;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
}
