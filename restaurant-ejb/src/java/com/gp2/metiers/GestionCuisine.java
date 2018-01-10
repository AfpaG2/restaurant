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

        Query query = em.createNamedQuery("com.gp2.persistence.carte.findCommandeEnCuisine");
        query.setParameter("paramIdStatut", idStatu);
        return query.getResultList();

    }

    public void changerStatutLigneCommande(String idStatut, String idLigneCommande) throws CustomedException {
        if (idStatut.isEmpty() || idLigneCommande.isEmpty()) {
            throw new CustomedException("L'idStatut ou idLigneCommande sont inconnus");
        }
        Long idLigneCommandeM = 0L;
        try {
            idLigneCommandeM = Long.valueOf(idLigneCommande);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le format de la ligne de commande n'est pas valide");
        }
        Integer idStatutM = 0;
        try {
            idStatutM = Integer.valueOf(idStatut);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le numéro de statut n'est pas valide");
        }
        if (idStatutM >= 2001 && idStatutM < 2010) {
            LigneCommande lc = em.find(LigneCommande.class, idLigneCommandeM);
            Statut statut = em.find(Statut.class, idStatutM);
            if (statut.getId() != (lc.getStatut().getId())) {
                lc.setStatut(statut);
            }
            em.merge(lc);
        }

    }

    public void changerStatutCommande(String idStatut, String idCommande) throws CustomedException {
        if (idStatut.isEmpty() || idCommande.isEmpty()) {
            throw new CustomedException("L'idStatut ou idCommande sont inconnus");
        }
        Long idCommandeM = 0L;
        try {
            idCommandeM = Long.valueOf(idCommande);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le format de l'idCommande n'est pas valide");
        }
        Integer idStatutM = 0;
        try {
            idStatutM = Integer.valueOf(idStatut);
        } catch (NumberFormatException ex) {
            throw new CustomedException("Le numéro de statut n'est pas valide");
        }
        if (idStatutM >= 1001 && idStatutM < 1010) {
            Commande commande = em.find(Commande.class, idCommandeM);
            Statut statut = em.find(Statut.class, idStatutM);
            if (statut.getId() != (commande.getStatut().getId())) {
                commande.setStatut(statut);
            }
            em.merge(commande);
        }

    }

    public Collection<Statut> findAllStatutCommande() {
        Query query = em.createNamedQuery("com.gp2.persistence.Statut.findAllStatutCommande");
        return query.getResultList();

    }

    public Collection<Statut> findAllStatutLigneCommande() {
        Query query = em.createNamedQuery("com.gp2.persistence.Statut.findAllStatutLigneCommande");
        return query.getResultList();

    }

}