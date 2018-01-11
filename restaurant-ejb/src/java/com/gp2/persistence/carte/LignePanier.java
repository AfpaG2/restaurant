package com.gp2.persistence.carte;

import java.io.Serializable;

public class LignePanier implements Serializable {

    private Produit produit;
    private int qte;
    private boolean formule;
    private float prixFormule;

    public LignePanier() {
    }

    public LignePanier(Produit produit) throws IllegalArgumentException {
        if (produit != null) {
            this.produit = produit;
            qte = 1;
        } else {
            throw new IllegalArgumentException("le produit null!!!");
        }
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return produit.getNomProduit() + "(qte= " + qte + ')';
    }

    public float getPrixHT() {
        if(this.formule){
            return this.prixFormule;
        } else
        return produit.getPrix() * qte;
    }

    public float getPrixTTC() {
        return produit.getPrixTTC() * qte;
    }

    public boolean isFormule() {
        return formule;
    }

    public void setFormule(boolean formule) {
        this.formule = formule;
    }

    public float getPrixFormule() {
        return prixFormule;
    }

    public void setPrixFormule(float prixFormule) {
        this.prixFormule = prixFormule;
    }
    
    
    

}
