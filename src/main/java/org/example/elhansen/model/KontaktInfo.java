package org.example.elhansen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KontaktInfo {

    @Id
    private Integer id = 1; // Vi hardcoder ID til 1, da der kun findes én række med stamdata

    private String adresse;      // "Guldbergsgade 29N..."
    private String telefon;      // "36 15 45 00"
    private String aabningstider; // "Man-Fre: 07:00 - 16:00"

    public KontaktInfo() {
    }

    public KontaktInfo(String adresse, String telefon, String aabningstider) {
        this.adresse = adresse;
        this.telefon = telefon;
        this.aabningstider = aabningstider;
    }

// Getters & Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAabningstider() {
        return aabningstider;
    }

    public void setAabningstider(String aabningstider) {
        this.aabningstider = aabningstider;
    }
}
