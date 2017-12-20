
package com.gp2.persistence.carte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CodeTVA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String type;
    private float tauxTVA;
    
    // propriétés pour les associations
    @OneToMany(mappedBy = "codeTVA")
    private Collection<Produit> produits;
    
    @OneToMany(mappedBy = "codeTVA")
    private Collection<Formule> formules;

    public CodeTVA() {
        produits = new ArrayList();
        formules = new ArrayList();
    }

    public CodeTVA(String type, float tauxTVA) {
        this();
        this.type = type;
        this.tauxTVA = tauxTVA;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(float tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Collection<Formule> getFormules() {
        return formules;
    }

    public void setFormules(Collection<Formule> formules) {
        this.formules = formules;
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
//        if (!(object instanceof CodeTVA)) {
//            return false;
//        }
//        CodeTVA other = (CodeTVA) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return type + " ("+ tauxTVA +" )";
    }
    
}
