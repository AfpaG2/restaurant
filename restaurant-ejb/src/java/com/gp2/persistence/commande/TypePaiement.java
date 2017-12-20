
package com.gp2.persistence.commande;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
public class TypePaiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomTypePaiement;
    
    // Gestion des dépendances
    @ManyToMany(mappedBy = "typePaiements")
    private Collection<Paiement> paiements;

    public TypePaiement() {
        paiements = new ArrayList<>();
    }

    public TypePaiement(String nomTypePaiement) {
        this();
        this.nomTypePaiement = nomTypePaiement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getNomTypePaiement() {
        return nomTypePaiement;
    }

    public void setNomTypePaiement(String nomTypePaiement) {
        this.nomTypePaiement = nomTypePaiement;
    }

    public Collection<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(Collection<Paiement> paiements) {
        this.paiements = paiements;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypePaiement)) {
            return false;
        }
        TypePaiement other = (TypePaiement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + this.nomTypePaiement + ")";
    }

}
