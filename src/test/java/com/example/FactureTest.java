package com.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactureTest {
    @Test
    public void testParameterizedConstructor() {
        // Test scenario: Test the parameterized constructor
        int id = 201;
        Date dateFact = new Date();
        String client = "Client Test";
        double total = 150.75;

        Facture facture = new Facture(id, dateFact, client, total);

        // Verify that all fields are correctly set
        assertEquals(id, facture.getId());
        assertEquals(dateFact, facture.getDateFact());
        assertEquals(client, facture.getClient());
        assertEquals(total, facture.getTotal(), 0.001); // Delta for double comparison

        System.out.println("Test du constructeur avec paramètres exécuté.");
    }

    @Test
    public void testClientSetter() {
        Facture facture = new Facture();

        String client = "New Client";

        facture.setClient(client);

        assertEquals(client, facture.getClient());

        System.out.println("Test du setter de client attribut exécuté.");
    }

    @Test
    public void testDateFactSetter() {
        Facture facture = new Facture();

        Date dateFact = new Date();

        facture.setDateFact(dateFact);

        assertEquals(dateFact, facture.getDateFact());

        System.out.println("Test du setter de dateFact attribut exécuté.");
    }
    @Test
    public void testTotalEdgeCases() {
        Facture facture = new Facture();

        // Test setting total to zero
        double zeroTotal = 0.0;
        facture.setTotal(zeroTotal);
        assertEquals(zeroTotal, facture.getTotal(), 0.001);

        // Test setting total to a negative value
        double negativeTotal = -50.25;
        facture.setTotal(negativeTotal);
        assertEquals(negativeTotal, facture.getTotal(), 0.001);

        System.out.println("Test des cas limites du total exécuté.");
    }
}