package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.Ilce;
import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.repository.MahalleRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@Service
public class MahalleServices extends JpaService<Mahalle, Long> {

    @Value("${kurum.kod}")
    private int kod;

    @Autowired
    private IlceServices ilceServices;

    private MahalleRepository repository;

    @Autowired
    public MahalleServices(MahalleRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Mahalle getNew() {
        return new Mahalle();
    }

    @Override
    public List<Mahalle> findAll() {
        Ilce ilce = ilceServices.findByKod(kod);
        return repository.findByIlce(ilce);
    }

}
