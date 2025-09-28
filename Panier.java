package com.artere.technicaltests.us2;

import com.artere.technicaltests.us1.Produit;

import java.util.HashMap;
import java.util.Map;

public class Panier {

    private Map<Integer, LignePanier> lignePaniers = new HashMap<>();

    public void ajouterProduit(Produit produit, int quantite) {
        if (lignePaniers.containsKey(produit.getId())) {
            LignePanier lignePanier = lignePaniers.get(produit.getId());
            lignePanier.setQuantite(lignePanier.getQuantite() + quantite);
        } else {
            lignePaniers.put(produit.getId(), new LignePanier(produit, quantite));
        }
        lignePaniers.put(produit.getId(), new LignePanier(produit, quantite));
    }

    public void modifierQuantite(int idProduit, int nouvelleQte) {
        if (lignePaniers.containsKey(idProduit)) {
            lignePaniers.get(idProduit).setQuantite(nouvelleQte);
        }
    }

    public void supprimerProduit(int idProduit) {
        lignePaniers.remove(idProduit);
    }

    public double getTotal() {
        return lignePaniers.values().stream().mapToDouble(LignePanier::getSousTotal).sum();
    }

    @Override
    public String toString() {
        return "Panier{" +
                "lignePaniers=" + lignePaniers +
                '}';
    }
}
