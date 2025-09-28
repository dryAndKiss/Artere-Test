package com.artere.technicaltests.us2;

import com.artere.technicaltests.us1.Produit;

public class Us2Test {

    public static void main(String[] args) {

        Produit tShirtBleu =  new Produit(101,"T-shirt bleu", 1200, 10);
        Produit tShirtRouge =  new Produit(1,"T-shirt rouge", 1200, 10);

        Panier panier = new Panier();

        panier.ajouterProduit(tShirtBleu,1);
        panier.ajouterProduit(tShirtRouge,2);

        panier.modifierQuantite(101,3);
        panier.supprimerProduit(102);

        System.out.println(panier);
    }
}
