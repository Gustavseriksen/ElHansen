package org.example.elhansen.repository;

import org.example.elhansen.model.Sag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SagRepository extends JpaRepository<Sag, Integer> {
    // Spring Boot laver automatisk metoderne til os
}
