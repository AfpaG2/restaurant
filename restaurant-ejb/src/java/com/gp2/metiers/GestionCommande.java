/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.Statut;
import com.gp2.persistence.carte.LignePanier;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.commande.Emplacement;
import com.gp2.persistence.commande.LigneCommande;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cdi307
 */
@Stateless
public class GestionCommande implements GestionCommandeLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;
    
    
    public Commande createCommande(Commande uneCommande){
        em.persist(uneCommande); 
        return uneCommande;
    }
    public Commande getCommande(String id){
        Query query = em.createNamedQuery("com.gp2.persistence.findCommandeById", Commande.class);
        Commande commande = (Commande) query.setParameter("idCommande", id);
            return commande;
    }
    public Collection<Commande> getAllCommandes(){
        Query query = em.createNamedQuery("com.gp2.persistence.getAllCommandes", Commande.class);
        Collection<Commande> listCommande = query.getResultList();
        return listCommande; 
    }
    
    public Commande validerCommande(Collection<LignePanier> lp){
        Commande com = new Commande();
        for (LignePanier lignePanier : lp) {
            LigneCommande ligne = new LigneCommande();
            ligne.setPrixHT(lignePanier.getPrixHT());
            ligne.setQuantite(lignePanier.getQte());
            ligne.setProduit(lignePanier.getProduit());
            com.getLigneCommandes().add(ligne);
        }
        
        em.persist(com);
        return com;
    }
    public Commande changeStatutCommande(Commande commande, Statut statut){
        Commande com= em.find(Commande.class, commande.getId());
        com.setStatut(statut);
        em.merge(com);
        return com;
    }
    public Boolean modifierCommande(Commande commande){
        Query query = em.createNamedQuery("com.gp2.persistence.findCommandeById", Commande.class);
        try {
        Commande com = (Commande) query.setParameter("idCommande", commande.getId());
        com = commande;
        em.merge(com);
        } catch (Exception e) {
            System.out.println("Commande introuvable (sorry !!!)");
        }
        return true;
    }

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Commande changeStatutCommande(Commande commande) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
