package org.example.elhansen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OmInfo {

    @Id
    private Integer id = 1;

    private String overskrift;          // "Ung energi og faglig stolthed"

    @Column(length = 2000)
    private String tekst1;              // Første lange afsnit

    @Column(length = 2000)
    private String tekst2;              // Andet lange afsnit

    // --- NYE FELTER ---
    private String underOverskrift;     // "Din garanti for en god oplevelse"

    @Column(length = 2000)
    private String garantiTekst;        // "Som selvstændig mester ved jeg..."

    @Column(length = 1000)
    private String citat;               // Boksen: "Har du brug for en elektriker..."

    private String billedeUrl;

    public OmInfo() {}

    public OmInfo(String overskrift, String tekst1, String tekst2, String underOverskrift, String garantiTekst, String citat, String billedeUrl) {
        this.overskrift = overskrift;
        this.tekst1 = tekst1;
        this.tekst2 = tekst2;
        this.underOverskrift = underOverskrift;
        this.garantiTekst = garantiTekst;
        this.citat = citat;
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

    public String getTekst1() {
        return tekst1;
    }

    public void setTekst1(String tekst1) {
        this.tekst1 = tekst1;
    }

    public String getTekst2() {
        return tekst2;
    }

    public void setTekst2(String tekst2) {
        this.tekst2 = tekst2;
    }

    public String getUnderOverskrift() {
        return underOverskrift;
    }

    public void setUnderOverskrift(String underOverskrift) {
        this.underOverskrift = underOverskrift;
    }

    public String getGarantiTekst() {
        return garantiTekst;
    }

    public void setGarantiTekst(String garantiTekst) {
        this.garantiTekst = garantiTekst;
    }

    public String getCitat() {
        return citat;
    }

    public void setCitat(String citat) {
        this.citat = citat;
    }

    public String getBilledeUrl() {
        return billedeUrl;
    }

    public void setBilledeUrl(String billedeUrl) {
        this.billedeUrl = billedeUrl;
    }
}
