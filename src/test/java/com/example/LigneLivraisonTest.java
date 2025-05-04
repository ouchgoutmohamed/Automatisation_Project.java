package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class LigneLivraisonTest {

    @Test
    public void testDefaultConstructor() {
        // Test scenario 1: Constructeur par défaut
        LigneLivraison ligne = new LigneLivraison();

        // Vérifier les valeurs par défaut
        assertEquals(0, ligne.getId());
        assertEquals(0, ligne.getQte());
        assertEquals("", ligne.getLibelle());

        System.out.println("Test du constructeur par défaut exécuté.");
    }

    @Test
    public void testParameterizedConstructor() {
        // Test scenario 2: Constructeur paramétré
        int id = 101;
        int qte = 7;
        String libelle = "Souris sans fil";

        LigneLivraison ligne = new LigneLivraison(id, qte, libelle);

        // Vérifier l'affectation des champs
        assertEquals(id, ligne.getId());
        assertEquals(qte, ligne.getQte());
        assertEquals(libelle, ligne.getLibelle());

        System.out.println("Test du constructeur paramétré exécuté.");
    }

    @Test
    public void testSettersAndGetters() {
        // Test scenario 3: Setters & getters
        LigneLivraison ligne = new LigneLivraison();

        ligne.setId(202);
        ligne.setQte(15);
        ligne.setLibelle("Casque audio");

        assertEquals(202, ligne.getId());
        assertEquals(15, ligne.getQte());
        assertEquals("Casque audio", ligne.getLibelle());

        System.out.println("Test des setters/getters exécuté.");
    }

    @Test
    public void testQuantityEdgeCases() {
        // Test scenario 4: Cas limites pour la quantité
        LigneLivraison ligne = new LigneLivraison();

        // Quantité zéro
        ligne.setQte(0);
        assertEquals(0, ligne.getQte());

        // Quantité négative (si autorisée par le modèle)
        ligne.setQte(-5);
        assertEquals(-5, ligne.getQte());

        System.out.println("Test des cas limites de quantité exécuté.");
    }
}
