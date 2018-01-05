package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.domain.GenelKodlar;
import com.tr.danismend.ebel.services.BinaMaliyetiServices;
import com.tr.danismend.ebel.services.GenelKodlarServices;
import com.tr.nebula.security.core.annotation.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@RestController
@RequestMapping(value = "building-cost")
public class BinaMaliyetiController {

    @Autowired
    BinaMaliyetiServices binaMaliyetiServices;

    @GetMapping
    public List<BinaMaliyeti> findAll() {
        return binaMaliyetiServices.findAll();
    }

    @PostMapping
    public BinaMaliyeti create(@RequestBody BinaMaliyeti binaMaliyeti) {
        return binaMaliyetiServices.create(binaMaliyeti);
    }

    @PutMapping
    public BinaMaliyeti update(@RequestBody BinaMaliyeti binaMaliyeti) {
        return binaMaliyetiServices.update(binaMaliyeti, binaMaliyeti.getId());
    }
}
