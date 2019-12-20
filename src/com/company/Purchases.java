package com.company;

import java.util.Date;

/**
 * The class where are the parameters of the purchases
 */
public class Purchases {
    private String nom;
    private String prenom;
    private String ref;
    private Date dateAchat;
    private Date daterRevente;

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

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Date getDaterRevente() {
        return daterRevente;
    }

    public void setDaterRevente(Date daterRevente) {
        this.daterRevente = daterRevente;
    }
}
