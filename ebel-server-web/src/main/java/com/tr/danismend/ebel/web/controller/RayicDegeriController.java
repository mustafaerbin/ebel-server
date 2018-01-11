package com.tr.danismend.ebel.web.controller;

import com.tr.danismend.ebel.domain.BinaMaliyeti;
import com.tr.danismend.ebel.domain.Mahalle;
import com.tr.danismend.ebel.domain.RayicDegeri;
import com.tr.danismend.ebel.services.MahalleServices;
import com.tr.danismend.ebel.services.RayicDegeriServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mustafa Erbin on 1/11/2018
 */
@RestController
@RequestMapping(value = "fair-value")
public class RayicDegeriController {

    @Autowired
    RayicDegeriServices rayicDegeriServices;

    @PostMapping(value = "find-fair-value")
    public List<RayicDegeri> listeRayicDegeri(@RequestBody RayicDegeri rayicDegeri) {
        return rayicDegeriServices.listeRayicDegeri(rayicDegeri);
    }
}
