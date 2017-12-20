package com.gp2.persistence.company;

import com.gp2.persistence.company.Employe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

/**
 * 
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
@Entity
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private String numeroSiret;
    
    @Column(nullable = false, length = 50)
    private String nomRestaurant;
    
    @Column(nullable = true, length = 400)
    private String adresse;
    
    @Column(nullable = true)
    private String telephone;
    
    @Column(nullable = true)
    private String email;
    
    // Gestion des dependances
    @OneToMany(mappedBy = "restaurant")
    private Collection<Employe> employes;

    public Restaurant() {
        employes = new ArrayList<>();
    }

    public Restaurant(String numeroSiret, String nomRestaurant) {
         this();
        this.numeroSiret = numeroSiret;
        this.nomRestaurant = nomRestaurant;
    }
    
    

    public Restaurant(String numeroSiret, String nomRestaurant, String adresse, String telephone, String email) {
        this();
        this.numeroSiret = numeroSiret;
        this.nomRestaurant = nomRestaurant;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Pattern(regexp = "^0[1-9]([-. ]?[0-9]{2}){4}$")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Collection<Employe> employes) {
        this.employes = employes;
    }
    
    
    
    @Override
    public String toString() {
        return this.nomRestaurant + "(" + this.telephone +")";
    }

}
