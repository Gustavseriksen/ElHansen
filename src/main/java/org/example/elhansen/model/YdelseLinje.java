package org.example.elhansen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YdelseLinje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String navn; // F.eks. "Væglampe montering"
    private double pris; // F.eks. 300.0

    // Konstruktører
    public YdelseLinje() {}

    public YdelseLinje(String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }

    // Getters og Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
