package com.artere.technicaltests.us1;

public class Produit {

    private int id;
    private String nom;
    private double prix;
    private int quantiteStock;

    Produit(int id,
            String nom,
            double prix
    ) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(int id,
            String nom,
            double prix,
            int quantiteStock
    ) {
        this(id, nom, prix);
        this.quantiteStock = quantiteStock;
    }

    public double getPrix() {
        return prix;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produit{id=" + id + "nom=" + nom + "`, prix=" + prix + "}";
    }
}
