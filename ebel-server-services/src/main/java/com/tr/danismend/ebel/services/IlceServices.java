package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.Ilce;
import com.tr.danismend.ebel.repository.IlceRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Service
public class IlceServices extends JpaService<Ilce, Long> {

    private IlceRepository repository;

    @Autowired
    public IlceServices(IlceRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Ilce getNew() {
        return new Ilce();
    }

    public Ilce findByKod(int kod) {
        return repository.findByKod(kod);
    }

}
