package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.services.GenelKodlarServices;
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
}
