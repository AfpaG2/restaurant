
package com.gp2.persistence.carte;

import com.gp2.persistence.Statut;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Ingredient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomIngredient;
    private float apportCalorique;

    //propriétés pour les associations
    @ManyToMany(mappedBy = "ingredients")
    private Collection<Produit> produits;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;
    
    //propriétés pour les associations
    @OneToMany(mappedBy = "ingredient")
    private Collection<InfosNutritionnelle> infosNutritionnelles;
    
    public Ingredient() {
        produits = new ArrayList();
        infosNutritionnelles = new ArrayList();
    }

    public Ingredient(String nomIngredient, float apportCalorique) {
        this();
        this.nomIngredient = nomIngredient;
        this.apportCalorique = apportCalorique;

    }

    public Ingredient(String nomIngredient) {
        this();
        this.nomIngredient = nomIngredient;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public float getApportCalorique() {
        return apportCalorique;
    }

    public void setApportCalorique(float apportCalorique) {
        this.apportCalorique = apportCalorique;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Collection<InfosNutritionnelle> getInfosNutritionnelles() {
        return infosNutritionnelles;
    }

    public void setInfosNutritionnelles(Collection<InfosNutritionnelle> infosNutritionnelles) {
        this.infosNutritionnelles = infosNutritionnelles;
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
//        if (!(object instanceof Ingredient)) {
//            return false;
//        }
//        Ingredient other = (Ingredient) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.Ingredient[ id=" + id + " ]";
    }
    
}
