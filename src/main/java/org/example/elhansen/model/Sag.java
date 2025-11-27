package org.example.elhansen.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Sag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String overskrift; // F.eks. "Nyt HPFI-relæ"

    @Column(length = 1000)
    private String beskrivelse; // Selve beskeden fra kunden

    // Kundeinfo
    private String kundeNavn;
    private String kundeEmail;
    private String kundeTlf;
    private String adresse; // Postnummer eller fuld adresse

    // Status: "NY", "TILBUD", "IGANG", "AFSLUTTET"
    private String status = "NY";

    private LocalDateTime oprettetDato = LocalDateTime.now();

    public Sag() {
    }

    public Sag(String overskrift, String beskrivelse, String kundeNavn, String kundeEmail, String kundeTlf, String adresse) {
        this.overskrift = overskrift;
        this.beskrivelse = beskrivelse;
        this.kundeNavn = kundeNavn;
        this.kundeEmail = kundeEmail;
        this.kundeTlf = kundeTlf;
        this.adresse = adresse;
    }

    // --- GETTERS & SETTERS (Generer evt. med Alt+Insert) ---

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getOverskrift() { return overskrift; }
    public void setOverskrift(String overskrift) { this.overskrift = overskrift; }

    public String getBeskrivelse() { return beskrivelse; }
    public void setBeskrivelse(String beskrivelse) { this.beskrivelse = beskrivelse; }

    public String getKundeNavn() { return kundeNavn; }
    public void setKundeNavn(String kundeNavn) { this.kundeNavn = kundeNavn; }

    public String getKundeEmail() { return kundeEmail; }
    public void setKundeEmail(String kundeEmail) { this.kundeEmail = kundeEmail; }

    public String getKundeTlf() { return kundeTlf; }
    public void setKundeTlf(String kundeTlf) { this.kundeTlf = kundeTlf; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getOprettetDato() { return oprettetDato; }
    public void setOprettetDato(LocalDateTime oprettetDato) { this.oprettetDato = oprettetDato; }
}