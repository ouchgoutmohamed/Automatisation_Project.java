package com.example;

import java.time.LocalDateTime;
import java.util.Objects;

public class Panier {
    private int userId;
    private int articleId;
    private int quantite;
    private LocalDateTime dateAjout;

    public Panier(int userId, int articleId, int quantite, LocalDateTime dateAjout) {
        if (quantite < 1) {
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        this.userId = userId;
        this.articleId = articleId;
        this.quantite = quantite;
        this.dateAjout = dateAjout;
    }

    public int getUserId() {
        return userId;
    }

    public int getArticleId() {
        return articleId;
    }

    public int getQuantite() {
        return quantite;
    }

    public LocalDateTime getDateAjout() {
        return dateAjout;
    }

    public void setQuantite(int quantite) {
        if (quantite < 1) {
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        this.quantite = quantite;
    }

    public void incrementQuantite(int amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Increment amount must be at least 1.");
        }
        this.quantite += amount;
    }

    public void decrementQuantite(int amount) {
        if (amount < 1 || this.quantite - amount < 1) {
            throw new IllegalArgumentException("Decrement amount is invalid.");
        }
        this.quantite -= amount;
    }



    @Override
    public String toString() {
        return "Panier{" +
                "userId=" + userId +
                ", articleId=" + articleId +
                ", quantite=" + quantite +
                ", dateAjout=" + dateAjout +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panier panier = (Panier) o;
        return userId == panier.userId &&
                articleId == panier.articleId &&
                quantite == panier.quantite &&
                Objects.equals(dateAjout, panier.dateAjout);
    }


}