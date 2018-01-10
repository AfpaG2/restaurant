/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.carte.Carte;
import com.gp2.persistence.carte.Formule;
import com.gp2.persistence.carte.NatureProduit;
import com.gp2.persistence.carte.Produit;
import com.gp2.persistence.carte.TypePlat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author youssef
 */
@Local
public interface GestionCatalogueLocal {

    public Carte getAllCarte();

    public Collection<Produit> getAllProduitsByNature(String nomNatureProduit);

    public Collection<Formule> getAllFormules();

    public Collection<TypePlat> getAllProduitsByTypePlat();

    public List<Produit> findAllProduitsByTypePlat(String typePlat);

    public Map<String, Collection<Produit>> getAllProduitsByFormule(Long formuleId);
    
    public Collection<NatureProduit> getAllNatureProduits();

    public Produit findProduitByName(String productName);
    
}
