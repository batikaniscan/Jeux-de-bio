/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.modele;

/**
 *
 * @author 1649904
 */
public class Utilisateur {

    private static int counter = 1;
    private int id;
    private String da;
    private String motDePasse;
    private String nom;
    private String prenom;

    public Utilisateur(String da, String motDePasse, String nom, String prenom) {
        this.da = da;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.id = counter;
        counter++;
    }
    
    public String getDa() {
        return da;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId() {
        return id;
    }

}
