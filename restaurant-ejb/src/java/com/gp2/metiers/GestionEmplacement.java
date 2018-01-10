
package com.gp2.metiers;

import com.gp2.persistence.commande.Emplacement;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionEmplacement implements GestionEmplacementLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    public List<Emplacement> findAllTables() {
        
        Query query = em.createNamedQuery("com2.gp2.persistence.commande.findAllEmplacements");
        
        return query.getResultList();
    }

    @Override
    public Emplacement findTableByNum(String numeroTable) {
        Query query = em.createNamedQuery("com2.gp2.persistence.commande.findEmplacementByNum")
                .setParameter("paramNumTable", numeroTable);
        
        return (Emplacement) query.getSingleResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Emplacement> findAllTablesByStatut(int idStatut) {
        
        Query query = em.createNamedQuery("com2.gp2.persistence.commande.findAllEmplacementsByStatut")
                .setParameter("paramIdStatut", idStatut);
        
        return query.getResultList();
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
