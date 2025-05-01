package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

class PanierTest {

    @Test
    void testPanierCreationAndGetters() {
        int userId = 9;
        int articleId = 101;
        int quantite = 5;
        LocalDateTime dateAjout = LocalDateTime.now();

        Panier panier = new Panier(userId, articleId, quantite, dateAjout);
        assertEquals(userId, panier.getUserId());
        assertEquals(articleId, panier.getArticleId());
        assertEquals(quantite, panier.getQuantite());
        assertEquals(dateAjout, panier.getDateAjout());
    }

    @Test
    void testConstructorValidation() {
        int userId = 1;
        int articleId = 1;
        LocalDateTime dateAjout = LocalDateTime.now();

        assertThrows(IllegalArgumentException.class, () -> new Panier(userId, articleId, 0, dateAjout));
    }

    @Test
    void testSetQuantite() {
        Panier panier = new Panier(1, 1, 5, LocalDateTime.now());
        panier.setQuantite(10);
        assertEquals(10, panier.getQuantite());

        assertThrows(IllegalArgumentException.class, () -> panier.setQuantite(0));
    }

    @Test
    void testToString() {
        Panier panier = new Panier(1, 1, 5, LocalDateTime.of(2023, 1, 1, 12, 0));
        String expected = "Panier{, userId=1, articleId=1, quantite=5, dateAjout=2023-01-01T12:00}";

    }


    @Test
    void testIncrementQuantite() {
        Panier panier = new Panier(1, 1, 5, LocalDateTime.now());
        panier.incrementQuantite(3);
        assertEquals(8, panier.getQuantite());

        assertThrows(IllegalArgumentException.class, () -> panier.incrementQuantite(0));
    }

    @Test
    void testDecrementQuantite() {
        Panier panier = new Panier(1, 1, 5, LocalDateTime.now());
        panier.decrementQuantite(2);
        assertEquals(3, panier.getQuantite());

        assertThrows(IllegalArgumentException.class, () -> panier.decrementQuantite(10));
    }
}