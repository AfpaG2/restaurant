/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.carte.LignePanier;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author youssef
 */
@Local
public interface GestionPanierLocal {
    public void ajouter(String reference);
    public Collection<LignePanier> getListe();
    public int getNombreProduit();
    public void enlever(String reference);
    public void supprimer(String reference);
    public void ajouter(String reference, int quantity);
    
}
