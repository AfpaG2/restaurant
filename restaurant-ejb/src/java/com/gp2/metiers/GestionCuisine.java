/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.outils.CustomedException;
import com.gp2.persistence.Statut;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.commande.LigneCommande;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author youssef
 */
@Stateless
public class GestionCuisine implements GestionCuisineLocal {

    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    public Collection<Commande> findCommandeByStatut(String idStatut) throws CustomedException {
        if (idStatut.trim().isEmpty()) {
            throw new CustomedException("L'idStatut est inconnu");
        }
        int idStatu;
        try {
            idStatu = Integer.parseInt(idStatut);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le format de la ligne commande n'est pas valide");
        }

        Query query = em.createNamedQuery("com.gp2.persistence.commande.Commande.findCommandeEnCuisine");
        query.setParameter("paramIdStatut", idStatu);
        Collection<Commande> listCommande = query.getResultList();
       
        for(Commande commande :listCommande){
            query = em.createNamedQuery("com.gp2.persistence.commande.LigneCommande.findLigneCommandeByCommande");
            query.setParameter("paramIdCommande", commande.getId());
            Collection<LigneCommande> listLigneCommande = query.getResultList();
            commande.getLigneCommandes().clear();
            commande.getLigneCommandes().addAll(listLigneCommande);
        }
        return listCommande;

    }

    @Override
    public void changerStatutLigneCommande(String valeurStatut, String idLigneCommande) throws CustomedException {
        if (valeurStatut.isEmpty() || idLigneCommande.isEmpty()) {
            throw new CustomedException("L'idStatut ou idLigneCommande sont inconnus");
        }
        Long idLigneCommandeM = 0L;
        try {
            idLigneCommandeM = Long.valueOf(idLigneCommande);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le format de la ligne de commande n'est pas valide");
        }
        
        
            LigneCommande lc = em.find(LigneCommande.class, idLigneCommandeM);
            
            Query query = em.createNamedQuery("com.gp2.persistence.Statut.findStatutLCByValeur");
            query.setParameter("paramValeurStatut", valeurStatut.trim());            
            Statut statut = (Statut) query.getSingleResult();
            
            if (!statut.getValeurStatut().equals(lc.getStatut().getValeurStatut())) {
                lc.setStatut(statut);
            }
            em.merge(lc);
        }

    

    @Override
    public void changerStatutCommande(String valeurStatut, String idCommande) throws CustomedException {
        if (valeurStatut.isEmpty() || idCommande.isEmpty()) {
            throw new CustomedException("L'idStatut ou idCommande sont inconnus");
        }
        Long idCommandeM = 0L;
        try {
            idCommandeM = Long.valueOf(idCommande);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le format de l'idCommande n'est pas valide");
        }
            Commande commande = em.find(Commande.class, idCommandeM);
            
            Query query = em.createNamedQuery("com.gp2.persistence.Statut.findStatutCommandeByValeur");
            query.setParameter("paramValeurStatut", valeurStatut.trim());            
            Statut statut = (Statut) query.getSingleResult();
            if (!statut.getValeurStatut().equals(commande.getStatut().getValeurStatut())) {
                commande.setStatut(statut);
            }
            em.merge(commande);
        

    }

    @Override
    public Collection<Statut> findAllStatutCommande() {
        Query query = em.createNamedQuery("com.gp2.persistence.Statut.findAllStatutCommande");
        return query.getResultList();

    }

    @Override
    public Collection<Statut> findAllStatutLigneCommande() {
        Query query = em.createNamedQuery("com.gp2.persistence.Statut.findAllStatutLigneCommande");
        return query.getResultList();

    }

}