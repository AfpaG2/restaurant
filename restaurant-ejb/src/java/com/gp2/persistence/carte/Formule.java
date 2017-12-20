
package com.gp2.persistence.carte;

import com.gp2.persistence.commande.LigneCommande;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
    @NamedQuery(name = "com.gp2.persistence.carte.Formule.findAllFormule", query = "select f from Formule f"),
    @NamedQuery(name = "com.gp2.persistence.carte.Formule.findFormuleById", query ="select f from Formule f where f.id=:paramId")
})
public class Formule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomFormul;
    private float prix;
    private String image;
    private String descrpition;
    //propriétés pour les associations
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private CodeTVA codeTVA;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Carte carte;
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Promotion promotion;
    
//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private Poromotion promotion;
    
    @OneToMany(mappedBy = "formule")
    private Collection<LigneCommande> ligneCommandes;
    
    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<TypePlat> typePlats;
    
    public Formule() {
        ligneCommandes = new ArrayList();
        typePlats  = new ArrayList();        
    }    

    public Formule(String nomFormul,String description, float prix) {
        this();
        this.nomFormul = nomFormul;
        this.descrpition = description;
        this.prix = prix;
    }

    public Formule(String nomFormul,String description, float prix, String image) {
        this();
        this.nomFormul = nomFormul;
        this.descrpition = description;
        this.prix = prix;
        this.image = image;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFormul() {
        return nomFormul;
    }
    

    public void setNomFormul(String nomFormul) {
        this.nomFormul = nomFormul;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CodeTVA getCodeTVA() {
        return codeTVA;
    }

    public void setCodeTVA(CodeTVA codeTVA) {
        this.codeTVA = codeTVA;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<TypePlat> getTypePlats() {
        return typePlats;
    }

    public void setTypePlats(Collection<TypePlat> typePlats) {
        this.typePlats = typePlats;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
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
//        if (!(object instanceof Formule)) {
//            return false;
//        }
//        Formule other = (Formule) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return nomFormul + " ("+ prix + " )" ;
    }
    
}
