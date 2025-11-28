package org.example.elhansen.controller;


import org.example.elhansen.model.ForsideInfo;
import org.example.elhansen.repository.ForsideInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/forside-info")
public class ForsideInfoRestController {

    @Autowired
    ForsideInfoRepository forsideInfoRepository;

    @GetMapping
    public ForsideInfo getInfo() {
        return forsideInfoRepository.findById(1)
                .orElse(new ForsideInfo(
                        "Professionelt El-arbejde",
                        "Vi sikrer lys i lampen og strøm i kontakten.",
                        "../images/frontpage-slider-image.jpg", // Standard sti hvis intet er valgt
                        "Velkommen til EL-Hansen",
                        "Her kan der stå lidt brødtekst om firmaet..."
                ));
    }

    @PutMapping
    public ForsideInfo updateInfo(@RequestBody ForsideInfo info) {
        info.setId(1);
        return forsideInfoRepository.save(info);
    }
}
