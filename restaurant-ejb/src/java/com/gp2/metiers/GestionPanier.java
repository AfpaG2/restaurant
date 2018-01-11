/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.carte.LignePanier;
import com.gp2.persistence.carte.Produit;
import java.util.Collection;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author youssef
 */
@Stateful
public class GestionPanier implements GestionPanierLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

   private HashMap<String, LignePanier> panier;
    
    @PostConstruct
    public void init(){        
        panier = new HashMap<>();
    }
    
    @Override
    public void ajouter(String reference, int quantity){
        if(reference != null){
            reference = reference.trim();
        }
        if(panier.containsKey(reference)){
            LignePanier lp = panier.get(reference);
            int newQte = lp.getQte() + quantity;
            if(newQte > lp.getProduit().getStock()){
                newQte = lp.getProduit().getStock();
            }
            lp.setQte(newQte);
        }else{            
            Long referenceLong = new Long(reference);            
            Produit p = em.find(Produit.class, referenceLong);
            
            try{
                LignePanier nlp = new LignePanier(p);
                panier.put(reference, nlp);
            }catch(IllegalArgumentException ex){
               
            }
        }
    }
    
   @Override
    public void ajouter(String reference){
        ajouter(reference,1);
    }
    
    @Override
    public void enlever(String reference){
        ajouter(reference,-1);
    }
    
    @Override
    public void supprimer(String reference){
        panier.remove(reference);
    }
    
    
    
    @Override
    public Collection<LignePanier> getListe(){
        return panier.values();
    }
    
    @Override
    public int getNombreProduit(){
        int somme = 0;
        for(LignePanier lp : panier.values()){
            somme += lp.getQte();
        }
        return somme;
    }
}
