package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Mustafa Erbin on 1/10/2018
 */
@Entity
@Table(name = "p_Ilce")
public class Ilce extends BaseEntity {

    @JsonProperty("label")
    private String isim;
    private int kod;
    @ManyToOne(fetch = FetchType.EAGER)
    private Il il;

    public Il getIl() {
        return il;
    }

    public void setIl(Il il) {
        this.il = il;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

}
