package com.example;

/**
 * Represents a delivery line item.
 */
public class LigneLivraison {
    private int id;
    private int qte;
    private String libelle;

    /**
     * Default constructor
     */
    public LigneLivraison() {
        this.id = 0;
        this.qte = 0;
        this.libelle = "";
    }

    /**
     * Parameterized constructor
     *
     * @param id      The ID of the delivery line
     * @param qte     The quantity
     * @param libelle The label or description
     */
    public LigneLivraison(int id, int qte, String libelle) {
        this.id = id;
        this.qte = qte;
        this.libelle = libelle;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "LigneLivraison{" +
                "id=" + id +
                ", qte=" + qte +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}