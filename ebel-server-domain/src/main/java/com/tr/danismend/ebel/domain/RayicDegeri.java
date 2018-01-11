package com.tr.danismend.ebel.domain;

import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by Mustafa Erbin on 11/01/2018.
 */
@Entity
public class RayicDegeri extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    private Mahalle mahalle;
    @ManyToOne(fetch = FetchType.EAGER)
    private Sokak sokak;
    private int yil;
    private BigDecimal deger;

    public Mahalle getMahalle() {
        return mahalle;
    }

    public void setMahalle(Mahalle mahalle) {
        this.mahalle = mahalle;
    }

    public Sokak getSokak() {
        return sokak;
    }

    public void setSokak(Sokak sokak) {
        this.sokak = sokak;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public BigDecimal getDeger() {
        return deger;
    }

    public void setDeger(BigDecimal deger) {
        this.deger = deger;
    }
}
