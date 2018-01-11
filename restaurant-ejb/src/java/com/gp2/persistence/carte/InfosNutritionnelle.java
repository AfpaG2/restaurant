
package com.gp2.persistence.carte;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class InfosNutritionnelle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String InfosNutritionnelle;
    private float valeur;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Ingredient ingredient;

    public InfosNutritionnelle() {
    }

    public InfosNutritionnelle(String InfosNutritionnelle, float valeur) {
        this();
        this.InfosNutritionnelle = InfosNutritionnelle;
        this.valeur = valeur;
    }

    public String getInfosNutritionnelle() {
        return InfosNutritionnelle;
    }

    public void setInfosNutritionnelle(String InfosNutritionnelle) {
        this.InfosNutritionnelle = InfosNutritionnelle;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
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

//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof InfosNutritionnelle)) {
//            return false;
//        }
//        InfosNutritionnelle other = (InfosNutritionnelle) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "com.gp2.entites.InfosNutritionnelle[ id=" + id + " ]";
    }
    
}
