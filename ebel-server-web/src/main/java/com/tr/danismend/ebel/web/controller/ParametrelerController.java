package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.Parametreler;
import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.services.ParametrelerServices;
import com.tr.danismend.ebel.services.TipServices;
import com.tr.nebula.security.core.annotation.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@RestController
@RequestMapping(value = "parameters")
public class ParametrelerController {

    @Autowired
    ParametrelerServices parametrelerServices;

    @Autowired
    TipServices tipServices;

    @Auth
    @GetMapping
    public List<Parametreler> findAll() {
        return parametrelerServices.findAll();
    }

    @PostMapping
    public Parametreler create(@RequestBody Parametreler parametreler) {
        return parametrelerServices.create(parametreler);
    }

    @PutMapping
    public Parametreler update(@RequestBody Parametreler parametreler) {
        return parametrelerServices.update(parametreler, parametreler.getId());
    }

    @GetMapping(value = "/test")
    public List<Parametreler> listeKod() {

        Tip tip = tipServices.findOne(3L);
        Parametreler parametreler = new Parametreler();
        parametreler.setTip(tip);
        List<Parametreler> byTipId = parametrelerServices.listeParametreler(parametreler);
        return byTipId;
    }

    @GetMapping(value = "type-code/{code}")
    public List<Parametreler> listeParametrelerTipKodu(@PathVariable("code") String code) {
        return parametrelerServices.listeParametrelerTipKodu(code);
    }

    @PostMapping(value = "find-parameters")
    public List<Parametreler> listeParametreler(@RequestBody Parametreler parametreler) {
        return parametrelerServices.listeParametreler(parametreler);
    }

}
