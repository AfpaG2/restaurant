
package com.gp2.persistence.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "com.gp2.persistence.company.findAllPostes", query = "SELECT p FROM Poste AS p"),
    @NamedQuery(name = "com.gp2.persistence.company.findPosteByNom", query = "SELECT p FROM Poste AS p WHERE p.nomPoste = :paramPoste "),
    // @NamedQuery(name = "com.gp2.entites.findPosteByNomEmploye", query = "SELECT p FROM Poste AS p WHERE p.employes.nom = :paramNomEmploye ")
})
public class Poste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private String nomPoste;
    
    @Column(nullable = true, length = 500)
    private String description;
    
    // Gestion des dependances
    @OneToMany(mappedBy = "poste")
    private Collection<Employe> employes;

    public Poste() {
        employes = new ArrayList<>();
    }

    public Poste(String nomPoste, String description) {
        this();
        this.nomPoste = nomPoste;
        this.description = description;
    }

    public String getNomPoste() {
        return nomPoste;
    }

    public void setNomPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Collection<Employe> employes) {
        this.employes = employes;
    }
    

    @Override
    public String toString() {
        return "(" + this.nomPoste + " )";
    }

}
