package com.gp2.metiers;

import com.gp2.persistence.carte.Carte;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.NatureProduit;
import com.gp2.persistence.carte.Produit;
import com.gp2.persistence.carte.TypePlat;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionCatalogue implements GestionCatalogueLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    public Carte getAllCarte(){
        return null;
    }
    
    public Collection<NatureProduit> getAllProduitsByNature(){
        return null;
    }
            
            
    public Collection<Formule>  getAllFormules(){        
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllFormule");
        return qr.getResultList(); 
    }
    
    public Collection<TypePlat>  getAllProduitsByTypePlat(){
        return null;
        
    }
    
    @Override
    public List<Produit> findAllProduits(int firstResult, int maxResult, String typePlat) {
        
        Query query = em.createNamedQuery("com.gp2.persistence.carte.findAllProduits", Produit.class);
        List<Produit> listeProduits = query
                .setParameter("typePlatParam", typePlat)
                .setFirstResult(firstResult)
                .setMaxResults(maxResult)
                .getResultList();

        return listeProduits;
    }

    
    
}
