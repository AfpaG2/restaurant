
package com.gp2.persistence.commande;

import com.gp2.persistence.Statut;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
public class Emplacement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String NumeroTable;    
    private int capacite;
    
    // gestion des dependances
    @OneToMany(mappedBy = "emplacement")
    private Collection<Commande> commandes;
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;

    public Emplacement() {
        commandes = new ArrayList<>();
    }

    public Emplacement(String NumeroTable, int capacite) {
        this();
        this.NumeroTable = NumeroTable;
        this.capacite = capacite;
    }

    public String getNumeroTable() {
        return NumeroTable;
    }

    public void setNumeroTable(String NumeroTable) {
        this.NumeroTable = NumeroTable;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }


    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    
    


    @Override
    public String toString() {
        return this.NumeroTable + "(" + this.capacite + " places)";
    }

}
