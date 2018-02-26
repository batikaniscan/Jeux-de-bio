/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.controleur;

import ca.qc.bdeb.modele.Jeu;
import ca.qc.bdeb.modele.Modele;
import ca.qc.bdeb.vue.Fenetre_principale;

/**
 *
 * @author 1649904
 */
public class Controleur {

    private Modele modele;

    public Controleur() {
        modele = new Modele();
        Fenetre_principale fenetre = new Fenetre_principale(this, modele);
    }

    public void validerUtilisateur(String utilisateurDA, char[] utilisateurMotDePasse) {
        modele.validerUtilisateur(utilisateurDA, utilisateurMotDePasse);
    }

    public String getLocationFenetrePrincipale() {
        return modele.getLocationFenetrePrincipale();
    }

    public String getLocationFenetrePrincipaleLogIn() {
        return modele.getLocationFenetrePrincipaleLogIn();
    }

    public String getLocationFenetreSelection() {
        return modele.getLocationFenetreSelection();
    }

    public String getNomNiveau(Jeu jeu, int i) {
        return modele.getNomNiveau(jeu, i);
    }

}