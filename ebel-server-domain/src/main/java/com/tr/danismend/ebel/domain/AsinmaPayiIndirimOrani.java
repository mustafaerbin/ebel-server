package com.tr.danismend.ebel.domain;

import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by Mustafa Erbin on 1/12/2018
 */
@Entity
public class AsinmaPayiIndirimOrani extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    private Parametreler yapiTur;
    private String yasAraligi;
    private String indirimOrani;

    public Parametreler getYapiTur() {
        return yapiTur;
    }

    public void setYapiTur(Parametreler yapiTur) {
        this.yapiTur = yapiTur;
    }

    public String getYasAraligi() {
        return yasAraligi;
    }

    public void setYasAraligi(String yasAraligi) {
        this.yasAraligi = yasAraligi;
    }

    public String getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(String indirimOrani) {
        this.indirimOrani = indirimOrani;
    }
}
