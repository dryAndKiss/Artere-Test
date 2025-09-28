package com.artere.technicaltests.us1;

public class Us1Test {

    public static void main(String[] args) {

        Categorie racine = new Categorie(1, "Catalogue");

        Categorie vetements = new Categorie(2, "Vetements");
        Categorie bijoux = new Categorie(2, "Bijoux");

        Produit collier = new Produit(1001, "ColLier", 299.9);
        Produit bracelet = new Produit(1002, "Bracelet", 399.9);

        Produit tShirt = new Produit(1003, "T-shirt", 199.9);

        racine.ajouterSousCategorie(bijoux);
        racine.ajouterSousCategorie(vetements);

        bijoux.ajouterProduit(collier);
        bijoux.ajouterProduit(bracelet);

        vetements.ajouterProduit(tShirt);

        racine.afficherCatalogue("");
        System.out.println(racine);
    }
}
