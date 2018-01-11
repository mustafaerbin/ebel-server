package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.domain.Parametreler;
import com.tr.danismend.ebel.services.MahalleServices;
import com.tr.nebula.security.core.annotation.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@RestController
@RequestMapping(value = "neighborhood")
public class MahalleController {

    @Autowired
    MahalleServices mahalleServices;

    @GetMapping
    public List<Mahalle> findAll() {
        return mahalleServices.findAll();
    }
}
