package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.RayicDegeri;
import com.tr.danismend.ebel.repository.RayicDegeriRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class RayicDegeriServices extends JpaService<RayicDegeri, Long> {

    private RayicDegeriRepository repository;

    @Autowired
    public RayicDegeriServices(RayicDegeriRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<RayicDegeri> listeRayicDegeri(RayicDegeri rayicDegeri) {
        return repository.findAll(Example.of(rayicDegeri));
    }
}