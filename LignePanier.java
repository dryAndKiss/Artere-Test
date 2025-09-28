package com.artere.technicaltests.us2;

import com.artere.technicaltests.us1.Produit;

public class LignePanier {

    private Produit produit;
    private int quantite;

    LignePanier(Produit produit,
                int quantite
    ) {
        this.produit = produit;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public Produit getProduit() {
        return produit;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getSousTotal() {
        return produit.getPrix()*quantite;
    }
    @Override
    public String toString() {
        return produit + " x " + quantite + " = " + getSousTotal()+ " Euro";
    }
}
