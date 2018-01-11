
package com.gp2.persistence.commande;

import com.gp2.persistence.Statut;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "com2.gp2.persistence.commande.findAllEmplacements", query = "SELECT DISTINCT empl FROM Emplacement empl WHERE empl.numeroTable LIKE 'seat%'"),
    @NamedQuery(name = "com2.gp2.persistence.commande.findEmplacementByNum", query = "SELECT DISTINCT empl FROM Emplacement empl WHERE empl.numeroTable = :paramNumTable"),
    @NamedQuery(name = "com2.gp2.persistence.commande.findAllEmplacementsByStatut", query = "SELECT DISTINCT empl FROM Emplacement empl WHERE empl.statut.id = :paramIdStatut AND empl.numeroTable LIKE 'seat%'"),
    @NamedQuery(name = "com2.gp2.persistence.commande.findAllTerminals", query = "SELECT DISTINCT empl FROM Emplacement empl WHERE empl.statut.id = :paramIdStatut AND empl.numeroTable LIKE 'terminal%'")
})
public class Emplacement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String numeroTable;    
    private int capacite;
    
    // gestion des dependances
    @OneToMany(mappedBy = "emplacement")
    private Collection<Commande> commandes;
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;

    public Emplacement() {
        commandes = new ArrayList<>();
    }

    public Emplacement(String numeroTable) {
        this();
        this.numeroTable = numeroTable;
    }

    public Emplacement(String numeroTable, int capacite) {
        this();
        this.numeroTable = numeroTable;
        this.capacite = capacite;
    }

    public String getNumeroTable() {
        return numeroTable;
    }

    public void setNumeroTable(String numeroTable) {
        this.numeroTable = numeroTable;
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
        return this.numeroTable + "(" + this.capacite + " places)";
    }

}
