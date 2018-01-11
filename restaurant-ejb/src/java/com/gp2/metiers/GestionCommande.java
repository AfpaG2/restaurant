
package com.gp2.metiers;

import com.gp2.persistence.Statut;
import com.gp2.persistence.carte.LignePanier;
import com.gp2.persistence.commande.Commande;
import com.gp2.persistence.commande.Emplacement;
import com.gp2.persistence.commande.LigneCommande;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
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
    
    public Commande validerCommande(Collection<LignePanier> lp, String numTable){
        System.out.println("coucou ligne panier : "+lp);
        Commande com = new Commande();
        Statut stat = em.find(Statut.class, 1001);
        Emplacement place = em.find(Emplacement.class, numTable);
        com.setEmplacement(place);
        Date date = new Date();
        com.setDateCommande(date);
        Collection<LigneCommande> lc = new ArrayList<>();
        for (LignePanier lignePanier : lp) {
            try {
            LigneCommande ligne = new LigneCommande();
            ligne.setPrixHT(lignePanier.getPrixHT());
                System.out.println(lignePanier.getQte());
            ligne.setQuantite(lignePanier.getQte());
            ligne.setCommande(com);
            ligne.setProduit(lignePanier.getProduit());
            ligne.setStatut(stat);
            em.merge(ligne);
            //com.setStatut(statut);
            lc.add(ligne);
            } catch (Exception e) {
                System.out.println("erreur validation commander : "+e.getMessage());
            }
        }
        com.setLigneCommandes(lc);
       
        
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

    public Commande validerCommande(Collection<LignePanier> lp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}