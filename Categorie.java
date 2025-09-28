package com.artere.technicaltests.us1;

import java.util.ArrayList;
import java.util.List;

public class Categorie {

    private int id;
    private String nom;
    private List<Categorie> sousCategories = new ArrayList<>();
    private List<Produit> produits = new ArrayList<>();

    Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    void ajouterSousCategorie(Categorie categorie) {
        sousCategories.add(categorie);
    }

    void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    void supprimerProduit(int idProduit) {
        produits.removeIf(p->p.getId() == idProduit);
    }
    void supprimerSousCategorie(int idSousCategorie) {
        sousCategories.removeIf(sc->sc.id == idSousCategorie);
    }


    public void afficherCatalogue(String prefix) {
        System.out.println(prefix + "Categorie" + nom);

        for (Produit p : produits) {
            System.out.println(prefix + "-" + p);
        }
        for (Categorie s : sousCategories) {
            System.out.println(prefix + "-" + s);
        }
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", sousCategories=" + sousCategories +
                ", produits=" + produits +
                '}';
    }
}
