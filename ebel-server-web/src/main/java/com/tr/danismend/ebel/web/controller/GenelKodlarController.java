package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.services.GenelKodlarServices;
import com.tr.danismend.ebel.services.TipServices;
import com.tr.nebula.security.core.annotation.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@RestController
@RequestMapping(value = "generic-codes")
public class GenelKodlarController {

    @Autowired
    GenelKodlarServices genelKodlarServices;

    @Autowired
    TipServices tipServices;

    @Auth
    @GetMapping
    public List<GenelKodlar> findAll() {
        return genelKodlarServices.findAll();
    }

    @PostMapping
    public GenelKodlar create(@RequestBody GenelKodlar genelKodlar) {
        return genelKodlarServices.create(genelKodlar);
    }

    @PutMapping
    public GenelKodlar update(@RequestBody GenelKodlar genelKodlar) {
        return genelKodlarServices.update(genelKodlar, genelKodlar.getId());
    }

    @GetMapping(value = "/test")
    public List<GenelKodlar> listeKod() {

        Tip tip = tipServices.findOne(3L);
        GenelKodlar genelKodlar = new GenelKodlar();
        genelKodlar.setTip(tip);
        List<GenelKodlar> byTipId = genelKodlarServices.listeGenelKodlar(genelKodlar);

        //List<GenelKodlar> byTipId = genelKodlarServices.findByTipId(3L);
        return byTipId;
    }

    @GetMapping(value = "type-code/{code}")
    public List<GenelKodlar> listeGenelKodlarTipKodu(@PathVariable("code") String code) {
        return genelKodlarServices.listeGenelKodlarTipKodu(code);
    }

    @PostMapping(value = "find-generic-codes")
    public List<GenelKodlar> listeGenelKodlar(@RequestBody GenelKodlar genelKodlar) {
        return genelKodlarServices.listeGenelKodlar(genelKodlar);
    }

}
