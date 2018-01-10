/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp2.metiers;

import com.gp2.outils.CustomedException;
import com.gp2.persistence.company.Employe;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author youssef
 */
@Stateless
public class GestionPersonnel implements GestionPersonnelLocal {
    @PersistenceContext(unitName = "restaurant-ejbPU")
    private EntityManager em;

   public Collection<Employe> getEmployes(){
       Query qr = em.createNamedQuery("com.gp2.persistence.canpany.Employe.findAllEmplye");
        return qr.getResultList();        
   }
   
   
   public String seconnecter(String mdp)throws CustomedException {
        Query qr = em.createNamedQuery("com.gp2.persistence.company.findFonctionByCode");
        qr.setParameter("paramMdp", mdp);
        return (String) qr.getSingleResult();
    }

    
}
