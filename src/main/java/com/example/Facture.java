package com.example;

import java.util.Date;

public class Facture {
    private int id;
    private Date dateFact;
    private String client;
    private double total;

    public Facture() {
    }

    public Facture(int id, Date dateFact, String client, double total) {
        this.id = id;
        this.dateFact = dateFact;
        this.client = client;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateFact() {
        return dateFact;
    }

    public void setDateFact(Date dateFact) {
        this.dateFact = dateFact;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}