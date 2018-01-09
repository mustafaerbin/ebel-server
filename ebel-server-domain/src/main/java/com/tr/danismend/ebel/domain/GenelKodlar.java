package com.tr.danismend.ebel.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tr.nebula.persistence.api.criteria.ann.SearchIgnore;
import com.tr.nebula.persistence.jpa.domain.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Mustafa Erbin on 1/5/2018
 * Parametrik veriler
 */
@Entity
@Table(name = "p_GenelKodlar")
public class GenelKodlar extends BaseEntity {

    @Id
    @Column
    @GeneratedValue
    @JsonProperty("value")
    private Long id;
    @JsonProperty("label")
    private String isim;
    private String kod;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private GenelKodlar anaKod; // parent'ı
    private boolean aktif = true;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Tip tip;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

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

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public GenelKodlar getAnaKod() {
        return anaKod;
    }

    public void setAnaKod(GenelKodlar anaKod) {
        this.anaKod = anaKod;
    }
}
