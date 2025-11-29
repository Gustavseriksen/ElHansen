package org.example.elhansen.controller;


import org.example.elhansen.model.TidligereOpgave;
import org.example.elhansen.repository.TidligereOpgaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/tidligere-opgaver")
public class TidligereOpgaveRestController {

    @Autowired
    TidligereOpgaveRepository repository;

    @GetMapping
    public List<TidligereOpgave> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public TidligereOpgave create(@RequestBody TidligereOpgave opgave) {
        return repository.save(opgave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Slettet", HttpStatus.OK);
    }

}
