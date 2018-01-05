package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.repository.TipRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class TipServices extends JpaService<Tip, Long> {

    private TipRepository repository;

    @Autowired
    public TipServices(TipRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
