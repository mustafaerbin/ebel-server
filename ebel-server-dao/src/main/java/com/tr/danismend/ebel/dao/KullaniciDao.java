package com.tr.danismend.ebel.dao;

import com.tr.danismend.ebel.domain.Kullanici;
import com.tr.nebula.persistence.jpa.dao.BaseDaoImpl;
import org.springframework.stereotype.Service;

/**
 * Created by Mustafa Erbin on 04/01/2018.
 */
@Service
public class KullaniciDao extends BaseDaoImpl<Kullanici, Long> {

    public Kullanici getNew() {
        return new Kullanici();
    }
}
