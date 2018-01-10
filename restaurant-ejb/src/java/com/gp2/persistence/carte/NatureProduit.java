
package com.gp2.persistence.carte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({    
    @NamedQuery(name = "com.gp2.persistence.carte.NatureProduit.findAllProduitsByNatureProduit", 
            query = "select p from NatureProduit n join n.produits p where n.nomNatureProduit=:paramNatureProduit"),
    @NamedQuery(name = "com.gp2.persistence.carte.NatureProduit.findAllNatureProduits", 
            query = "select n from NatureProduit n"),
    @NamedQuery(name = "com.gp2.persistence.carte.NatureProduit.findNatureProduitById", query ="select n from NatureProduit n where n.nomNatureProduit=:paramNomNatureProduit")
})
public class NatureProduit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id   
    private String nomNatureProduit;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Carte carte;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Produit> produits;

    public NatureProduit() {
        produits = new ArrayList();
    }

    public NatureProduit(String nomNatureProduit) {
        this();
        this.nomNatureProduit = nomNatureProduit;
    }
    

    public String getNomNatureProduit() {
        return nomNatureProduit;
    }

    public void setNomNatureProduit(String nomNatureProduit) {
        this.nomNatureProduit = nomNatureProduit;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (nomNatureProduit != null ? nomNatureProduit.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof NatureProduit)) {
//            return false;
//        }
//        NatureProduit other = (NatureProduit) object;
//        if ((this.nomNatureProduit == null && other.nomNatureProduit != null) || (this.nomNatureProduit != null && !this.nomNatureProduit.equals(other.nomNatureProduit))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.NatureProduit[ id=" + nomNatureProduit + " ]";
    }
    
}
