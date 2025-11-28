package org.example.elhansen.model;

import jakarta.persistence.*;

@Entity
public class ForsideInfo {


    @Id
    private Integer id = 1; // Altid ID 1

    // Hero Sektion (Det store billede i toppen)
    private String heroOverskrift;      // "Professionelt El-arbejde"
    private String heroUnderoverskrift; // "Vi sikrer lys i lampen..."
    private String heroBilledeUrl;      // Baggrundsbilledet

    // Velkomst Sektion (Den hvide boks underneden)
    private String velkomstOverskrift;  // "Velkommen til EL-Hansen"

    @Column(length = 2000)
    private String velkomstTekst;       // "Her kan der stå lidt brødtekst..."

    public ForsideInfo() {}

    public ForsideInfo(String heroOverskrift, String heroUnderoverskrift, String heroBilledeUrl, String velkomstOverskrift, String velkomstTekst) {
        this.heroOverskrift = heroOverskrift;
        this.heroUnderoverskrift = heroUnderoverskrift;
        this.heroBilledeUrl = heroBilledeUrl;
        this.velkomstOverskrift = velkomstOverskrift;
        this.velkomstTekst = velkomstTekst;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeroOverskrift() {
        return heroOverskrift;
    }

    public void setHeroOverskrift(String heroOverskrift) {
        this.heroOverskrift = heroOverskrift;
    }

    public String getHeroUnderoverskrift() {
        return heroUnderoverskrift;
    }

    public void setHeroUnderoverskrift(String heroUnderoverskrift) {
        this.heroUnderoverskrift = heroUnderoverskrift;
    }

    public String getHeroBilledeUrl() {
        return heroBilledeUrl;
    }

    public void setHeroBilledeUrl(String heroBilledeUrl) {
        this.heroBilledeUrl = heroBilledeUrl;
    }

    public String getVelkomstOverskrift() {
        return velkomstOverskrift;
    }

    public void setVelkomstOverskrift(String velkomstOverskrift) {
        this.velkomstOverskrift = velkomstOverskrift;
    }

    public String getVelkomstTekst() {
        return velkomstTekst;
    }

    public void setVelkomstTekst(String velkomstTekst) {
        this.velkomstTekst = velkomstTekst;
    }
}
