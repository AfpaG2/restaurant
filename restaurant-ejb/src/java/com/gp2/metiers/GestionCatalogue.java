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
    @SuppressWarnings("unchecked")
    public Collection<Produit> getAllProduitsByNature(String nomNatureProduit) {
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.NatureProduit.findAllProduitsByNatureProduit");
        qr.setParameter("paramNatureProduit", nomNatureProduit);
        return qr.getResultList();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public Collection<NatureProduit> getAllNatureProduits() {
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.NatureProduit.findAllNatureProduits");
        return qr.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Formule> getAllFormules() {
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllFormule");
        return qr.getResultList();
    }

    public Collection<TypePlat> getAllProduitsByTypePlat() {
        return null;

    }

    @Override
    public List<Produit> findAllProduitsByTypePlat(String typePlat) {

        Query query = em.createNamedQuery("com.gp2.persistence.carte.findAllProduits", Produit.class);
        @SuppressWarnings("unchecked")
        List<Produit> listeProduits = query.setParameter("typePlatParam", typePlat).getResultList();

        return listeProduits;
    }
    
    @Override
    public Produit findProduitByName(String productName) {

        Query query = em.createNamedQuery("com.gp2.persistence.carte.findProduitByName", Produit.class);
        
        Produit produit = (Produit) query.setParameter("paramNomProduit", productName).getSingleResult();
                
        return produit;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Collection<Produit>> getAllProduitsByFormule(Long formuleId) {
        @SuppressWarnings("unchecked")
        Map<String, Collection<Produit>> map = new HashMap();
        Query qr = em.createNamedQuery("com.gp2.persistence.carte.Formule.findAllTypePlatByFormule");
        qr.setParameter("paramId", formuleId);
        @SuppressWarnings("unchecked")
        Collection<String> typePlats = qr.getResultList();

        @SuppressWarnings("unchecked")
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
