package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;

/**
 * Created by Mustafa Erbin on 1/10/2018
 */
@Entity
@Table(name = "p_Sokak")
public class Sokak extends BaseEntity {

    @Id
    @Column
    @GeneratedValue
    @JsonProperty("value")
    private Long id;
    @JsonProperty("label")
    private String isim;
    private int kod;
    @ManyToOne(fetch = FetchType.EAGER)
    private Mahalle mahalle;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
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

    public Mahalle getMahalle() {
        return mahalle;
    }

    public void setMahalle(Mahalle mahalle) {
        this.mahalle = mahalle;
    }
}
