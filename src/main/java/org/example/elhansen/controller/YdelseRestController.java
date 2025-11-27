package org.example.elhansen.controller;

import org.example.elhansen.model.Ydelse;
import org.example.elhansen.repository.YdelseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/ydelser")
public class YdelseRestController {

    @Autowired
    YdelseRepository ydelseRepository;

    // GET: Hent alle ydelser (til både admin og forside)
    @GetMapping
    public List<Ydelse> getAllYdelser() {
        return ydelseRepository.findAll();
    }

    // POST: Opret ny ydelse (til admin)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ydelse opretYdelse(@RequestBody Ydelse ydelse) {
        return ydelseRepository.save(ydelse);
    }

    // DELETE: Slet ydelse
    @DeleteMapping("/{id}")
    public ResponseEntity<String> sletYdelse(@PathVariable int id) {
        ydelseRepository.deleteById(id);
        return new ResponseEntity<>("Slettet", HttpStatus.OK);
    }
}
