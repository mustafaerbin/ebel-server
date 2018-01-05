package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.Tip;
import com.tr.danismend.ebel.services.TipServices;
import com.tr.nebula.security.core.annotation.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/5/2018
 */
@RestController
@RequestMapping(value = "type")
public class TipController {

    @Autowired
    private TipServices tipServices;

    @Auth
    @GetMapping
    public List<Tip> findAll() {
        return tipServices.findAll();
    }

    @PostMapping
    public Tip create(@RequestBody Tip tip) {
        return tipServices.create(tip);
    }

    @PutMapping
    public Tip update(@RequestBody Tip tip) {
        return tipServices.update(tip, tip.getId());
    }
}
