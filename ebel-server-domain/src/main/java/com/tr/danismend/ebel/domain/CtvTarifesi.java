package com.tr.danismend.ebel.domain;

import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by Mustafa Erbin on 1/15/2018
 */
@Entity
public class CtvTarifesi extends BaseEntity {

    private int yil;
    private String grup;
    private String birinceDerece;
    private String ikinciDerece;
    private String ucuncuDerece;
    private String dorduncuDerece;
    private String besinciDerece;

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getBirinceDerece() {
        return birinceDerece;
    }

    public void setBirinceDerece(String birinceDerece) {
        this.birinceDerece = birinceDerece;
    }

    public String getIkinciDerece() {
        return ikinciDerece;
    }

    public void setIkinciDerece(String ikinciDerece) {
        this.ikinciDerece = ikinciDerece;
    }

    public String getUcuncuDerece() {
        return ucuncuDerece;
    }

    public void setUcuncuDerece(String ucuncuDerece) {
        this.ucuncuDerece = ucuncuDerece;
    }

    public String getDorduncuDerece() {
        return dorduncuDerece;
    }

    public void setDorduncuDerece(String dorduncuDerece) {
        this.dorduncuDerece = dorduncuDerece;
    }

    public String getBesinciDerece() {
        return besinciDerece;
    }

    public void setBesinciDerece(String besinciDerece) {
        this.besinciDerece = besinciDerece;
    }
}
