package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.services.CtvTarifesiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mustafa Erbin on 1/15/2018
 */
@RestController
@RequestMapping(value = "ctv")
public class CtvTarifesiController {

    @Autowired
    CtvTarifesiServices ctvTarifesiServices;
}
