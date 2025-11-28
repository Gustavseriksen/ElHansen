package org.example.elhansen.controller;

import org.example.elhansen.model.KontaktInfo;
import org.example.elhansen.repository.KontaktInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/kontaktinfo")
public class KontaktInfoRestController {


    @Autowired
    KontaktInfoRepository kontaktInfoRepository;

    // GET: Hent stamdata
    @GetMapping
    public KontaktInfo getKontaktInfo() {
        // Vi prøver at finde ID 1. Hvis den ikke findes (første gang), returnerer vi et tomt objekt
        return kontaktInfoRepository.findById(1)
                .orElse(new KontaktInfo("Adresse her", "00 00 00 00", "Lukket"));
    }


    // PUT: Opdater stamdata
    @PutMapping
    public KontaktInfo updateKontaktInfo(@RequestBody KontaktInfo info) {
        info.setId(1); // Sikrer at vi altid overskriver række 1
        return kontaktInfoRepository.save(info);
    }
}
