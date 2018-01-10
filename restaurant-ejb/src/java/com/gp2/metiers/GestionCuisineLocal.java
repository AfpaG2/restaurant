/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.outils.CustomedException;
import com.gp2.persistence.Statut;
import com.gp2.persistence.commande.Commande;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author youssef
 */
@Local
public interface GestionCuisineLocal {

    public Collection<Commande> findCommandeByStatut(String idStatut) throws CustomedException;

    public void changerStatutLigneCommande(String idStatut, String idLigneCommande) throws CustomedException;

    public void changerStatutCommande(String idStatut, String idCommande) throws CustomedException;

    public Collection<Statut> findAllStatutCommande();

    public Collection<Statut> findAllStatutLigneCommande();

}