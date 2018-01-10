package com.tr.danismend.ebel.domain;

import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by Mustafa Erbin on 04/01/2018.
 */
@Entity
public class BinaMaliyeti extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    private Parametreler yapiTür;
    @ManyToOne(fetch = FetchType.EAGER)
    private Parametreler yapiFaliyet;
    private int yil;
    private String basit;
    private String lüks;
    private String birinciSinif;
    private String ikinciSinif;
    private String ucuncuSinif;

    public Parametreler getYapiTür() {
        return yapiTür;
    }

    public void setYapiTür(Parametreler yapiTür) {
        this.yapiTür = yapiTür;
    }

    public Parametreler getYapiFaliyet() {
        return yapiFaliyet;
    }

    public void setYapiFaliyet(Parametreler yapiFaliyet) {
        this.yapiFaliyet = yapiFaliyet;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getBasit() {
        return basit;
    }

    public void setBasit(String basit) {
        this.basit = basit;
    }

    public String getLüks() {
        return lüks;
    }

    public void setLüks(String lüks) {
        this.lüks = lüks;
    }

    public String getBirinciSinif() {
        return birinciSinif;
    }

    public void setBirinciSinif(String birinciSinif) {
        this.birinciSinif = birinciSinif;
    }

    public String getIkinciSinif() {
        return ikinciSinif;
    }

    public void setIkinciSinif(String ikinciSinif) {
        this.ikinciSinif = ikinciSinif;
    }

    public String getUcuncuSinif() {
        return ucuncuSinif;
    }

    public void setUcuncuSinif(String ucuncuSinif) {
        this.ucuncuSinif = ucuncuSinif;
    }
}
