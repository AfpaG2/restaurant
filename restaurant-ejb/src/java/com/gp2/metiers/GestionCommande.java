/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.commande.Commande;
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
        Query query = em.createNamedQuery("com.gp2.persistence.getCommande", Commande.class);
            return null;
    }
    public Collection<Commande> getAllCommandes(){
        Query query = em.createNamedQuery("com.gp2.persistence.getAllCommandes", Commande.class);
        Collection<Commande> listCommande = query.getResultList();
        return listCommande; 
    }
    public Commande changeStatutCommande(Commande commande){
        return null;
    }
    public Commande modifierCommande(Commande commande){
        return null;
    }

    public void persist(Object object) {
        em.persist(object);
    }

}
