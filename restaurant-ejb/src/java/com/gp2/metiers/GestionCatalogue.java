package com.gp2.metiers;

import com.gp2.persistence.carte.Carte;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.NatureProduit;
import com.gp2.persistence.carte.Produit;
import com.gp2.persistence.carte.TypePlat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionCatalogue implements GestionCatalogueLocal {

    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

    @Override
    public Carte getAllCarte() {
        return null;
    }

    @Override
    public Collection<NatureProduit> getAllProduitsByNature(String nomNatureProduit) {
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.NatureProduit.findAllProduitsByNatureProduit");
        qr.setParameter("paramNatureProduit", nomNatureProduit);
        return qr.getResultList();
    }

    @Override
    public Collection<Formule> getAllFormules() {
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllFormule");
        return qr.getResultList();
    }

    public Collection<TypePlat> getAllProduitsByTypePlat() {
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
    
    @Override
    public Produit findProduitByName(String productName) {

        Query query = em.createNamedQuery("com.gp2.persistence.carte.findProduitByName", Produit.class);
        
        Produit produit = (Produit) query.setParameter("paramNomProduit", productName).getSingleResult();
                
        return produit;
    }

    @Override
    public Map<String, Collection<Produit>> getAllProduitsByFormule(Long formuleId) {
        Map<String, Collection<Produit>> map = new HashMap();
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllTypePlatByFormule");
        qr.setParameter("paramId", formuleId);
        Collection<String> typePlats = qr.getResultList();

        Collection<Produit> produits = qr.getResultList();
        Collection<Produit> typeProduits;
        for (String cle : typePlats) {
            qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllProduitsByFormule");
            qr.setParameter("paramId", formuleId);
            qr.setParameter("paramTypePlat", cle);
            typeProduits = new ArrayList();
            typeProduits = qr.getResultList();
            map.put(cle, typeProduits);
        }
        return map;
    }

    
    
    
}
