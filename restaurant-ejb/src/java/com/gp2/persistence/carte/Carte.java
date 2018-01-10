
package com.gp2.persistence.carte;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Carte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCarte;
    
    @OneToMany(mappedBy = "carte")
    private Collection <TypePlat> typePlats;
    
    @OneToMany(mappedBy = "carte")
    private Collection <NatureProduit> natureProduits;
    
    @OneToMany(mappedBy = "carte")
    private Collection <Formule> formules;
    

    public Carte() {
        typePlats = new ArrayList();
        natureProduits= new ArrayList();
        formules= new ArrayList();
    }

    public Carte(String nomCarte) {
        this();
        this.nomCarte = nomCarte;
    }

    public Collection<NatureProduit> getNatureProduits() {
        return natureProduits;
    }

    public void setNatureProduits(Collection<NatureProduit> natureProduits) {
        this.natureProduits = natureProduits;
    }

    public Collection<Formule> getFormules() {
        return formules;
    }

    public void setFormules(Collection<Formule> formules) {
        this.formules = formules;
    }
    
    public String getNomCarte() {
        return nomCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<TypePlat> getTypePlats() {
        return typePlats;
    }

    public void setTypePlats(Collection<TypePlat> typePlats) {
        this.typePlats = typePlats;
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
        if (!(object instanceof Carte)) {
            return false;
        }
        Carte other = (Carte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gp2.entites.Carte[ id=" + id + " ]";
    }
    
}
