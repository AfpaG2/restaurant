/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.persistence;

import com.gp2.persistence.commande.Emplacement;
import com.gp2.persistence.commande.LigneCommande;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.Ingredient;
import com.gp2.persistence.carte.Produit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({    
    @NamedQuery(name = "com.gp2.persistence.Statut.findAllStatutCommande", query = "SELECT s FROM Statut AS s WHERE s.id >=1001 and s.id<1010"),
    @NamedQuery(name = "com.gp2.persistence.Statut.findAllStatutLigneCommande", query = "SELECT s FROM Statut AS s WHERE s.id >=2001 and s.id<2010"),
    @NamedQuery(name = "com.gp2.persistence.Statut.findStatutByValeur", query = "SELECT s FROM Statut AS s WHERE s.valeurStatut =:paramValeurStatut")
})
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id 
    private int id;
    @Column(nullable = false) 
    private String nomStatut;
    @Column(nullable = false) 
    private String valeurStatut;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Produit> produits;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Formule> formules;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Ingredient> ingredients;
    
    @OneToMany(mappedBy = "statut")
    private Collection<LigneCommande> ligneCommandes;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Commande> commandes;
    
    @OneToMany(mappedBy = "statut")
    private Collection<Emplacement> emplacements;
    
    public Statut() {
        produits= new ArrayList<>();
        formules= new ArrayList<>();
        ingredients= new ArrayList<>();                
        ligneCommandes = new ArrayList<>();
        commandes = new ArrayList<>();
        emplacements = new ArrayList<>();        
    }

    public Statut(int id) {
        this();
        this.id = id;
    }
    
    

    public Statut(int id, String nomStatut, String valeurStatut) {
        this();
        this.id = id;
        this.nomStatut = nomStatut;
        this.valeurStatut = valeurStatut;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Collection<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Collection<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       

    public String getNomStatut() {
        return nomStatut;
    }

    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }

    public String getValeurStatut() {
        return valeurStatut;
    }

    public void setValeurStatut(String valeurStatut) {
        this.valeurStatut = valeurStatut;
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

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    
    @Override
    public String toString() {
        return "com.gp2.entites.Statut[ id=" + id + " ]";
    }
    
}