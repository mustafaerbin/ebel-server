package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.Sokak;
import com.tr.danismend.ebel.services.SokakServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@RestController
@RequestMapping(value = "street")
public class SokakController {

    @Autowired
    private SokakServices sokakServices;

    @GetMapping(value = "listeSokakMahalleId/{mahalleId}")
    public List<Sokak> listeSokakMahalleId(@PathVariable("mahalleId") Long mahalleId) {
        return sokakServices.listeSokakMahalleId(mahalleId);
    }
}
