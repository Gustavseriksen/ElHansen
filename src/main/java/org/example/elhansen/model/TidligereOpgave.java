package org.example.elhansen.model;

import jakarta.persistence.*;

@Entity
public class TidligereOpgave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String overskrift;      // F.eks. "Nyt køkken på Østerbro"

    @Column(length = 1000)
    private String beskrivelse;     // "Vi installerede spots og nye kontakter..."

    private String billedeUrl;      // Link til billedet

    public TidligereOpgave() {}

    public TidligereOpgave(String overskrift, String beskrivelse, String billedeUrl) {
        this.overskrift = overskrift;
        this.beskrivelse = beskrivelse;
        this.billedeUrl = billedeUrl;
    }


    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getBilledeUrl() {
        return billedeUrl;
    }

    public void setBilledeUrl(String billedeUrl) {
        this.billedeUrl = billedeUrl;
    }
}
