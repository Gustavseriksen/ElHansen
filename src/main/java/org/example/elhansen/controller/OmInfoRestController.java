package org.example.elhansen.controller;

import org.example.elhansen.model.OmInfo;
import org.example.elhansen.repository.OmInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/om-info")
public class OmInfoRestController {

    @Autowired
    OmInfoRepository omInfoRepository;

    @GetMapping
    public OmInfo getInfo() {
        // Vi prøver at finde ID 1.
        // Hvis databasen er tom (første gang), opretter vi et objekt med alle 7 parametre
        return omInfoRepository.findById(1)
                .orElse(new OmInfo(
                        "Velkommen til EL-Hansen",                  // Overskrift
                        "Her kan du skrive din hovedtekst...",      // Tekst 1
                        "Mere tekst om firmaet...",                 // Tekst 2
                        "Din garanti for kvalitet",                 // Underoverskrift (NY)
                        "Vi garanterer at alt spiller...",          // Garantitekst (NY)
                        "Kunden er altid i centrum hos os.",        // Citat (NY)
                        "https://placehold.co/600x400"              // Billede URL
                ));
    }

    @PutMapping
    public OmInfo updateInfo(@RequestBody OmInfo info) {
        info.setId(1); // Sikrer at vi altid overskriver række 1
        return omInfoRepository.save(info);
    }
}
