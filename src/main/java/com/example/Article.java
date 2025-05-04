package com.example;

/**
 * Represents an article with order information.
 */
public class Article {
    private int id;
    private String reference;
    private String libelle;
    private int quantiteCommande;

    /**
     * Default constructor
     * Initializes with default values but throws exception if used directly
     */
    public Article() {
        this.id = 0;
        this.reference = "";
        this.libelle = "";
        this.quantiteCommande = 0;
    }

    /**
     * Constructor with parameters
     *
     * @param id               The article ID
     * @param reference        The article reference code
     * @param libelle          The article label/name
     * @param quantiteCommande The ordered quantity
     * @throws IllegalArgumentException if reference is empty or quantiteCommande is less than 1
     */
    public Article(int id, String reference, String libelle, int quantiteCommande) {
        this.id = id;
        setReference(reference);
        this.libelle = libelle;
        setQuantiteCommande(quantiteCommande);
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    /**
     * Sets the reference for this article
     *
     * @param reference The article reference code
     * @throws IllegalArgumentException if reference is null or empty
     */
    public void setReference(String reference) {
        if (reference == null || reference.trim().isEmpty()) {
            throw new IllegalArgumentException("La référence de l'article ne peut pas être vide");
        }
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    /**
     * Sets the ordered quantity for this article
     *
     * @param quantiteCommande The ordered quantity
     * @throws IllegalArgumentException if quantiteCommande is less than 1
     */
    public void setQuantiteCommande(int quantiteCommande) {
        if (quantiteCommande < 1) {
            throw new IllegalArgumentException("La quantité commandée doit être au moins 1");
        }
        this.quantiteCommande = quantiteCommande;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantiteCommande=" + quantiteCommande +
                '}';
    }
}