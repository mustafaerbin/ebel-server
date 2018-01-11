package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.domain.Sokak;
import com.tr.danismend.ebel.repository.SokakRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Service
public class SokakServices extends JpaService<Sokak, Long> {

    private SokakRepository repository;

    @Autowired
    public SokakServices(SokakRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Sokak getNew() {
        return new Sokak();
    }

    public List<Sokak> listeSokakMahalleId(Long mahalleId) {
        return repository.findByMahalle_Id(mahalleId);
    }
}
