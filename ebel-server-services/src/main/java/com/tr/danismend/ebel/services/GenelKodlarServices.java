package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.repository.GenelKodlarRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class GenelKodlarServices extends JpaService<GenelKodlar, Long> {

    private GenelKodlarRepository repository;

    @Autowired
    public GenelKodlarServices(GenelKodlarRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<GenelKodlar> findByTipId(Long parentOid) {
        return repository.findByTip_id(parentOid);
    }

    public List<GenelKodlar> findByTip(Tip tip) {
        return repository.findByTip(tip);
    }
}
