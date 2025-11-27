package org.example.elhansen.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ydelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String navn;
    // Vi fjerner den faste 'pris' felt her, da prisen nu udregnes fra linjerne
    // Men du kan beholde den som en "fra pris" hvis du vil. Jeg fjerner den for at tvinge beregneren til at bruge linjerne.

    @Column(length = 500)
    private String beskrivelse;
    private String ikonNavn;

    // VIGTIGT: Her laver vi forbindelsen til linjerne
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ydelse_id") // Dette laver en fremmednøgle i YdelseLinje tabellen
    private List<YdelseLinje> linjer = new ArrayList<>();

    public Ydelse() {}

    public Ydelse(String navn, String beskrivelse, String ikonNavn) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.ikonNavn = ikonNavn;
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

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getIkonNavn() {
        return ikonNavn;
    }

    public void setIkonNavn(String ikonNavn) {
        this.ikonNavn = ikonNavn;
    }

    public List<YdelseLinje> getLinjer() {
        return linjer;
    }

    public void setLinjer(List<YdelseLinje> linjer) {
        this.linjer = linjer;
    }
}
