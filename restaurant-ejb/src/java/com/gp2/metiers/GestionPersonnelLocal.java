/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.outils.CustomedException;
import com.gp2.persistence.company.Employe;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author youssef
 */
@Local
public interface GestionPersonnelLocal {
    public Collection<Employe> getEmployes();
     public String seconnecter(String mdp)throws CustomedException ;
    
}
