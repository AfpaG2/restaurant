
package com.gp2.persistence.company;

import com.gp2.persistence.commande.Commande;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "com.gp2.persistence.company.findAllEmployees", query = "SELECT e FROM Employe e"),
    @NamedQuery(name = "com.gp2.persistence.company.findByName", query = "SELECT e FROM Employe e WHERE e.nom = :paramNom"),    
    @NamedQuery(name = "com.gp2.persistence.company.findFonctionByCode", query = "SELECT distinct r.name FROM Employe e join e.roles r WHERE r.mdp = :paramMdp"),
    
})
public class Employe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    @NotNull
    private String prenom;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @Past   // The value of the field must be a date in the past
    private Date dateNaissance;

    @Column(nullable = true)
    @Pattern(regexp = "^0[1-9]([-. ]?[0-9]{2}){4}$", 
            message = "{Numéro de téléphone mobile invalide!}")
    private String telephone;
    @Column(nullable = true)
    private String adresse;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    
    // Gestion des dépendances
    @OneToMany(mappedBy = "employe")
    private Collection<Commande> commandes;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Role> roles;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Restaurant restaurant;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Poste poste;
    
    public Employe() {
        commandes = new ArrayList<>();
        roles= new ArrayList<>();
    }

    public Employe(String nom, String prenom, String telephone, String adresse) {
        this();
        this.nom = nom;
        this.prenom = prenom;        
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public Employe(String nom, String prenom, Date dateNaissance, String telephone, String adresse, Date dateEmbauche, Date dateFin) {
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;        
        this.telephone = telephone;
        this.adresse = adresse;
        this.dateEmbauche = dateEmbauche;
        this.dateFin = dateFin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    
    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
    

    @Override
    public String toString() {
        return this.prenom + " "  + this.nom.toUpperCase();
    }

}
