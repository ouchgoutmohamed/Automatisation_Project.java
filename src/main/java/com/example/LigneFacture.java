package com.example;

/**
 * Represents a line item in an invoice.
 */
public class LigneFacture {
    private String produitId;
    private String description;
    private int quantite;
    private double prixUnitaire;
    private double montantTotal;

    /**
     * Default constructor
     */
    public LigneFacture() {
        this.produitId = "";
        this.description = "";
        this.quantite = 0;
        this.prixUnitaire = 0.0;
        this.montantTotal = 0.0;
    }

    /**
     * Constructor with parameters
     * 
     * @param produitId    The product ID
     * @param description  The product description
     * @param quantite     The quantity
     * @param prixUnitaire The unit price
     */
    public LigneFacture(String produitId, String description, int quantite, double prixUnitaire) {
        this.produitId = produitId;
        this.description = description;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.calculerMontantTotal();
    }

    /**
     * Calculate the total amount based on quantity and unit price
     */
    public void calculerMontantTotal() {
        this.montantTotal = this.quantite * this.prixUnitaire;
    }

    // Getters and setters
    public String getProduitId() {
        return produitId;
    }

    public void setProduitId(String produitId) {
        this.produitId = produitId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
        this.calculerMontantTotal();
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
        this.calculerMontantTotal();
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    @Override
    public String toString() {
        return "LigneFacture{" +
                "produitId='" + produitId + '\'' +
                ", description='" + description + '\'' +
                ", quantite=" + quantite +
                ", prixUnitaire=" + prixUnitaire +
                ", montantTotal=" + montantTotal +
                '}';
    }
}