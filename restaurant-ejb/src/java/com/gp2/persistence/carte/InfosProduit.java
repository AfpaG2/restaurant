
package com.gp2.persistence.carte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class InfosProduit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String valeur;
    private String unite;
            
    //propriétés pour les associations
    @ManyToMany(mappedBy = "infosProduits")
    private Collection<Produit> produits;

    public InfosProduit() {
        produits = new ArrayList();
    }

    public InfosProduit(String nom, String valeur) {
        this();
        this.nom = nom;
        this.valeur = valeur;
    }
    
    

    public InfosProduit(String nom, String valeur, String unite) {
        this();
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public InfosProduit(String nom) {
        this();
        this.nom = nom;
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
    
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof InfosProduit)) {
//            return false;
//        }
//        InfosProduit other = (InfosProduit) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.InfosProduit[ id=" + id + " ]";
    }
    
}
