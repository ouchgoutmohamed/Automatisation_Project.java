package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LigneFactureTest {

    @Test
    public void testDefaultConstructor() {
        // Test scenario 1: Test the default constructor
        LigneFacture ligne = new LigneFacture();
        
        // Verify that all fields are initialized with default values
        assertEquals("", ligne.getProduitId());
        assertEquals("", ligne.getDescription());
        assertEquals(0, ligne.getQuantite());
        assertEquals(0.0, ligne.getPrixUnitaire());
        assertEquals(0.0, ligne.getMontantTotal());
        
        System.out.println("Test du constructeur par défaut exécuté.");
    }
    
    @Test
    public void testParameterizedConstructorAndCalculation() {
        // Test scenario 2: Test the parameterized constructor and calculation of total amount
        String produitId = "PROD123";
        String description = "Ordinateur portable";
        int quantite = 2;
        double prixUnitaire = 1200.50;
        
        LigneFacture ligne = new LigneFacture(produitId, description, quantite, prixUnitaire);
        
        // Verify that all fields are correctly set
        assertEquals(produitId, ligne.getProduitId());
        assertEquals(description, ligne.getDescription());
        assertEquals(quantite, ligne.getQuantite());
        assertEquals(prixUnitaire, ligne.getPrixUnitaire());
        
        // Verify that the total amount is correctly calculated
        double expectedTotal = quantite * prixUnitaire;
        assertEquals(expectedTotal, ligne.getMontantTotal());
        
        System.out.println("Test du constructeur avec paramètres et calcul du montant total exécuté.");
    }
    
    @Test
    public void testSettersAndRecalculation() {
        // Test scenario 3: Test the setters and recalculation of total amount
        LigneFacture ligne = new LigneFacture("PROD456", "Souris sans fil", 1, 25.99);
        
        // Initial values
        assertEquals("PROD456", ligne.getProduitId());
        assertEquals("Souris sans fil", ligne.getDescription());
        assertEquals(1, ligne.getQuantite());
        assertEquals(25.99, ligne.getPrixUnitaire());
        assertEquals(25.99, ligne.getMontantTotal());
        
        // Change values using setters
        ligne.setProduitId("PROD789");
        ligne.setDescription("Clavier mécanique");
        ligne.setQuantite(3);
        ligne.setPrixUnitaire(89.99);
        
        // Verify that fields are updated
        assertEquals("PROD789", ligne.getProduitId());
        assertEquals("Clavier mécanique", ligne.getDescription());
        assertEquals(3, ligne.getQuantite());
        assertEquals(89.99, ligne.getPrixUnitaire());
        
        // Verify that the total amount is recalculated
        double expectedTotal = 3 * 89.99;
        assertEquals(expectedTotal, ligne.getMontantTotal());
        
        System.out.println("Test des setters et recalcul du montant total exécuté.");
    }
}