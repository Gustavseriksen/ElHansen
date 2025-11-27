package org.example.elhansen.repository;

import org.example.elhansen.model.Ydelse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YdelseRepository extends JpaRepository<Ydelse, Integer> {
    // Tomt interface - Spring laver automatisk metoderne: findAll(), save(), deleteById() osv.
}
