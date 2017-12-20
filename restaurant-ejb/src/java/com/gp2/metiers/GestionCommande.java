/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.commande.Commande;
import javax.ejb.Stateless;

/**
 *
 * @author cdi307
 */
@Stateless
public class GestionCommande implements GestionCommandeLocal {
    
    public Commande createCommande(Commande uneCommande){

        return uneCommande;
    }
    public Commande getCommande(String id){
        return null;
    }
    public Commande getAllCommandes(){
        return null; 
    }
    public Commande changeStatutCommande(Commande commande){
        return null;
    }
    public Commande modifierCommande(Commande commande){
        return null;
    }

}
