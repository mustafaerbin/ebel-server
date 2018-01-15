package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.CtvTarifesi;
import com.tr.danismend.ebel.domain.Ilce;
import com.tr.danismend.ebel.repository.CtvTarifesiRepository;
import com.tr.danismend.ebel.repository.IlceRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Service
public class CtvTarifesiServices extends JpaService<CtvTarifesi, Long> {

    private CtvTarifesiRepository repository;

    @Autowired
    public CtvTarifesiServices(CtvTarifesiRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public CtvTarifesi getNew() {
        return new CtvTarifesi();
    }

    public List<CtvTarifesi> listeCtvTarifesiYil(int yil) {
        return repository.findByYil(yil);
    }
}
