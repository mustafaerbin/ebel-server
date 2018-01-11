package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mustafa Erbin on 04/01/2018.
 */
@Entity
@Table(name = "p_Il")
public class Il extends BaseEntity {

    @JsonProperty("label")
    private String isim;
    private int kod;

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
