package com.tr.danismend.ebel.domain;

import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mustafa Erbin on 1/5/2018
 * parametrik veri grupları
 */
@Entity
@Table(name = "p_Tip")
public class Tip extends BaseEntity {

    private String isim;
    private String kod;
    private boolean aktif;

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
