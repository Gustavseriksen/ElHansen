package org.example.elhansen.controller;

import org.example.elhansen.model.Sag;
import org.example.elhansen.repository.SagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin // Tillader at din frontend må snakke med backend
@RequestMapping("/api/sager")
public class SagRestController {

    @Autowired
    SagRepository sagRepository;

    // 1. GET: Hent alle sager (til Kanban boardet)
    @GetMapping
    public List<Sag> getAlleSager() {
        return sagRepository.findAll();
    }

    // 2. POST: Opret ny sag (Fra kontaktformularen)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sag opretSag(@RequestBody Sag Sag) {
        // Vi sætter status til "NY" som standard, hvis den ikke er sat
        if (Sag.getStatus() == null) {
            Sag.setStatus("NY");
        }
        return sagRepository.save(Sag);
    }

    // 3. PUT: Opdater status (Når du flytter kort i Kanban)
    // Kaldes f.eks. via: /api/sager/5/status?nyStatus=IGANG
    @PutMapping("/{id}/status")
    public ResponseEntity<Sag> opdaterStatus(@PathVariable Integer id, @RequestParam String nyStatus) {
        return sagRepository.findById(id)
                .map(sag -> {
                    sag.setStatus(nyStatus);
                    return new ResponseEntity<>(sagRepository.save(sag), HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // 4. DELETE: Slet en sag
    @DeleteMapping("/{id}")
    public ResponseEntity<String> sletSag(@PathVariable Integer id) {
        sagRepository.deleteById(id);
        return new ResponseEntity<>("Sag slettet", HttpStatus.OK);
    }


}
