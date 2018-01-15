package com.tr.danismend.ebel.services;

import com.tr.danismend.ebel.domain.AsinmaPayiIndirimOrani;
import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.repository.AsinmaPayiIndirimOraniRepository;
import com.tr.danismend.ebel.repository.BinaMaliyetiRepository;
import com.tr.nebula.persistence.jpa.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@Service
public class AsinmaPayiIndirimOraniServices extends JpaService<AsinmaPayiIndirimOrani, Long> {

    private AsinmaPayiIndirimOraniRepository repository;

    @Autowired
    public AsinmaPayiIndirimOraniServices(AsinmaPayiIndirimOraniRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<AsinmaPayiIndirimOrani> listeAsinaPayiIndirimOraniYapiTurId(Long yaipTurId) {
        return repository.findByYapiTur_Id(yaipTurId);
    }

    public List<AsinmaPayiIndirimOrani> listeAsinmaPayiIndirimOrani(AsinmaPayiIndirimOrani asinmaPayiIndirimOrani) {
        return repository.findAll(Example.of(asinmaPayiIndirimOrani));
    }

}