package com.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonLivraisonTest {
    @Test
    public void testParameterizedConstructor() {
        // Test scenario 2: Test the parameterized constructor and calculation of total amount
        int id = 101;
        Date date = new Date();
        String adresseLivraison = "Rue Test N 10";
        BonLivraisonEtat etat = BonLivraisonEtat.EN_COURS;

        BonLivraison bonLivraison = new BonLivraison(id, adresseLivraison, date, etat);

        // Verify that all fields are correctly set
        assertEquals(id, bonLivraison.getId());
        assertEquals(date, bonLivraison.getDateLivraison());
        assertEquals(adresseLivraison, bonLivraison.getAdresseLivraison());
        assertEquals(etat, bonLivraison.getEtat());

        System.out.println("Test du constructeur avec paramètres");
    }

    @Test
    public void testAdresseLivraisonSetter() {
        BonLivraison bonLivraison = new BonLivraison();

        String adresse = "Testing address";

        bonLivraison.setAdresseLivraison(adresse);

        assertEquals(adresse, bonLivraison.getAdresseLivraison());

        System.out.println("Test du setter de adresseLivraison attribut");
    }

    @Test
    public void testDateSetter() {
        BonLivraison bonLivraison = new BonLivraison();

        Date date = new Date();

        bonLivraison.setDateLivraison(date);

        assertEquals(date, bonLivraison.getDateLivraison());

        System.out.println("Test du setter de dateLivraison attribut");
    }
}
