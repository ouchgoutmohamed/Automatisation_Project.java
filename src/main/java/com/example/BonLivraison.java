package com.example;

import java.util.Date;

public class BonLivraison {
    private int id;
    private Date dateLivraison;
    private String adresseLivraison;
    private BonLivraisonEtat etat;

    public BonLivraison() {
    }

    public BonLivraison(int id, String adresseLivraison, Date dateLivraison, BonLivraisonEtat etat) {
        this.id = id;
        this.adresseLivraison = adresseLivraison;
        this.dateLivraison = dateLivraison;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public BonLivraisonEtat getEtat() {
        return etat;
    }

    public void setEtat(BonLivraisonEtat etat) {
        this.etat = etat;
    }
}
