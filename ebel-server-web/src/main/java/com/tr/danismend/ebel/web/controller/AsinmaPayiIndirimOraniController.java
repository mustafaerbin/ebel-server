package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.AsinmaPayiIndirimOrani;
import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.services.AsinmaPayiIndirimOraniServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/12/2018
 */
@RestController
@RequestMapping(value = "abrasion-discount")
public class AsinmaPayiIndirimOraniController {

    @Autowired
    private AsinmaPayiIndirimOraniServices asinmaPayiIndirimOraniServices;

    @GetMapping(value = "{yapiTurId}")
    public List<AsinmaPayiIndirimOrani> listeAsinaPayiIndirimOraniYapiTurId(@PathVariable("yapiTurId") Long yapiTurId) {
        return asinmaPayiIndirimOraniServices.listeAsinaPayiIndirimOraniYapiTurId(yapiTurId);
    }

    @PostMapping(value = "find-abrasion-discount")
    public List<AsinmaPayiIndirimOrani> listeAsinmaPayiIndirimOrani(@RequestBody AsinmaPayiIndirimOrani asinmaPayiIndirimOrani) {
        return asinmaPayiIndirimOraniServices.listeAsinmaPayiIndirimOrani(asinmaPayiIndirimOrani);
    }

}
