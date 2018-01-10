package com.gp2.metiers;

import com.gp2.persistence.Statut;
import com.gp2.persistence.carte.LignePanier;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.commande.Emplacement;
import com.gp2.persistence.commande.LigneCommande;
import java.util.Collection;
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

    @Override
    public Commande createCommande(Commande uneCommande) {
        em.persist(uneCommande);
        return uneCommande;
    }

    @Override
    public Commande getCommande(String id) {
        Query query = em.createNamedQuery("com.gp2.persistence.findCommandeById", Commande.class);
        Commande commande = (Commande) query.setParameter("idCommande", id);
        return commande;
    }

    @Override
    public Collection<Commande> getAllCommandes() {
        Query query = em.createNamedQuery("com.gp2.persistence.getAllCommandes", Commande.class);
        Collection<Commande> listCommande = query.getResultList();
        return listCommande;
    }

    @Override
    public Commande validerCommande(Collection<LignePanier> lp, String numTable) {
        Commande com = new Commande();
        for (LignePanier lignePanier : lp) {
            try {
                Emplacement place = em.find(Emplacement.class, numTable);
                Statut statut = em.find(Statut.class, 1001);
                LigneCommande ligne = new LigneCommande();
                ligne.setPrixHT(lignePanier.getPrixHT());
                ligne.setQuantite(lignePanier.getQte());
                ligne.setProduit(lignePanier.getProduit());
                com.setEmplacement(place);
                com.setStatut(statut);
                com.getLigneCommandes().add(ligne);
            } catch (Exception e) {
                System.out.println("erreur validation commander : " + e.getMessage());
            }
        }

        em.persist(com);
        return com;
    }

    @Override
    public Commande changeStatutCommande(Commande commande, Statut statut) {
        Commande com = em.find(Commande.class, commande.getId());
        com.setStatut(statut);
        em.merge(com);
        return com;
    }

    @Override
    public Boolean modifierCommande(Commande commande) {
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

    @Override
    public Commande validerCommande(Collection<LignePanier> lp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
