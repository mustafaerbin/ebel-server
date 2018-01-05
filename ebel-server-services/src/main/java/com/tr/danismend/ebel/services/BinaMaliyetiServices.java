package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.repository.BinaMaliyetiRepository;
import com.tr.danismend.ebel.repository.GenelKodlarRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class BinaMaliyetiServices extends JpaService<BinaMaliyeti, Long> {

    private BinaMaliyetiRepository repository;

    @Autowired
    public BinaMaliyetiServices(BinaMaliyetiRepository repository) {
        super(repository);
        this.repository = repository;
    }
}