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
    private GenelKodlar tür;
    @ManyToOne(fetch = FetchType.EAGER)
    private GenelKodlar faliyet;
    private int yil;
    private String basit;
    private String lüks;
    private String birinciSinif;
    private String ikinciSinif;
    private String ucuncuSinif;


}
