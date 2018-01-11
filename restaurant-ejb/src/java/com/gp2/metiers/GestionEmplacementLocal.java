/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.persistence.commande.Emplacement;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionEmplacementLocal {
    
    public List<Emplacement> findAllTables();
    public Emplacement findTableByNum(String numeroTable);
    public List<Emplacement> findAllTablesByStatut(int idStatut);
    public List<Emplacement> findAllTerminals(int idStatut);
    
}
