package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.Parametreler;
import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.domain.enums.EnumTip;
import com.tr.danismend.ebel.repository.ParametrelerRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class ParametrelerServices extends JpaService<Parametreler, Long> {

    private ParametrelerRepository repository;

    @Autowired
    private TipServices tipServices;

    @Autowired
    public ParametrelerServices(ParametrelerRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Parametreler getNew() {
        return new Parametreler();
    }

    public List<Parametreler> findByTipId(Long parentOid) {
        return repository.findByTip_id(parentOid);
    }

    public List<Parametreler> findByTip(Tip tip) {
        if (tip.getKod().equals(EnumTip.YIL.name()))
            return repository.findByTipOrderByIsimDesc(tip);
        else
            return repository.findByTipOrderByIsimAsc(tip);
    }

    public List<Parametreler> listeParametrelerTipKodu(String tipKodu) {
        return findByTip(tipServices.findByKod(tipKodu));
    }

    public List<Parametreler> listeParametreler(Parametreler parametreler) {
        return repository.findAll(Example.of(parametreler));
    }

}
