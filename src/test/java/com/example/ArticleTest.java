package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArticleTest {

    @Test
    public void testDefaultConstructor() {
        // Test scenario 1: Test the default constructor
        Article article = new Article();

        // Verify that all fields are initialized with default values
        assertEquals(0, article.getId());
        assertEquals("", article.getReference());
        assertEquals("", article.getLibelle());
        assertEquals(0, article.getQuantiteCommande());

        System.out.println("Test du constructeur par défaut exécuté.");
    }

    @Test
    public void testParameterizedConstructor() {
        // Test scenario 2: Test the parameterized constructor
        int id = 101;
        String reference = "REF-ABC123";
        String libelle = "Écran 24 pouces";
        int quantiteCommande = 5;

        Article article = new Article(id, reference, libelle, quantiteCommande);

        // Verify that all fields are correctly set
        assertEquals(id, article.getId());
        assertEquals(reference, article.getReference());
        assertEquals(libelle, article.getLibelle());
        assertEquals(quantiteCommande, article.getQuantiteCommande());

        System.out.println("Test du constructeur avec paramètres exécuté.");
    }

    @Test
    public void testReferenceCannotBeEmpty() {
        // Test scenario 3: Test that reference cannot be empty
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Article(101, "", "Écran 24 pouces", 5);
        });

        String expectedMessage = "La référence de l'article ne peut pas être vide";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("Test de la contrainte sur la référence exécuté.");
    }

    @Test
    public void testReferenceCannotBeNull() {
        // Test scenario 4: Test that reference cannot be null
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Article(101, null, "Écran 24 pouces", 5);
        });

        String expectedMessage = "La référence de l'article ne peut pas être vide";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("Test de la contrainte sur la référence null exécuté.");
    }

    @Test
    public void testQuantiteCommandeMinimum() {
        // Test scenario 5: Test that quantiteCommande must be at least 1
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Article(101, "REF-ABC123", "Écran 24 pouces", 0);
        });

        String expectedMessage = "La quantité commandée doit être au moins 1";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("Test de la contrainte sur la quantité minimale exécuté.");
    }

    @Test
    public void testSetNegativeQuantiteCommande() {
        // Test scenario 6: Test that quantiteCommande cannot be negative
        Article article = new Article(101, "REF-ABC123", "Écran 24 pouces", 5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            article.setQuantiteCommande(-3);
        });

        String expectedMessage = "La quantité commandée doit être au moins 1";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("Test de la contrainte sur la quantité négative exécuté.");
    }

    @Test
    public void testSetEmptyReference() {
        // Test scenario 7: Test that reference cannot be set to empty
        Article article = new Article(101, "REF-ABC123", "Écran 24 pouces", 5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            article.setReference("   ");
        });

        String expectedMessage = "La référence de l'article ne peut pas être vide";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("Test de la contrainte sur la modification de référence exécuté.");
    }

    @Test
    public void testSetters() {
        // Test scenario 8: Test valid setters
        Article article = new Article(102, "REF-XYZ789", "Casque audio", 1);

        // Initial values
        assertEquals(102, article.getId());
        assertEquals("REF-XYZ789", article.getReference());
        assertEquals("Casque audio", article.getLibelle());
        assertEquals(1, article.getQuantiteCommande());

        // Change values using setters
        article.setId(103);
        article.setReference("REF-DEF456");
        article.setLibelle("Clavier ergonomique");
        article.setQuantiteCommande(3);

        // Verify that fields are updated
        assertEquals(103, article.getId());
        assertEquals("REF-DEF456", article.getReference());
        assertEquals("Clavier ergonomique", article.getLibelle());
        assertEquals(3, article.getQuantiteCommande());

        System.out.println("Test des setters valides exécuté.");
    }

    @Test
    public void testToString() {
        // Test scenario 9: Test the toString method
        Article article = new Article(104, "REF-GHI789", "Souris sans fil", 2);

        String expectedString = "Article{" +
                "id=" + 104 +
                ", reference='" + "REF-GHI789" + '\'' +
                ", libelle='" + "Souris sans fil" + '\'' +
                ", quantiteCommande=" + 2 +
                '}';

        assertEquals(expectedString, article.toString());

        System.out.println("Test de la méthode toString exécuté.");
    }
}