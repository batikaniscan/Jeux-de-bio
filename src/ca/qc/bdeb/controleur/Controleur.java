/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.controleur;

import ca.qc.bdeb.modele.Jeu;
import ca.qc.bdeb.modele.Modele;
import ca.qc.bdeb.vue.principale.FenetrePrincipale;
import java.util.ArrayList;

/**
 *
 * @author 164990
 */
public class Controleur {

    private Modele modele;

    public Controleur() {
        modele = new Modele();
        FenetrePrincipale fenetre = new FenetrePrincipale(this, modele);
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

    public String getLocationNiveau(Jeu jeu, int i) {
        return modele.getLocationNiveau(jeu, i);
    }

    public int[][] getCoordonneesBoitesReponsesDragDrop(int i) {
        return modele.getCoordonneesBoitesReponsesDragDrop(i);
    }

    public ArrayList getQuestionsDragDrop(int i) {
        return modele.getQuestionsDragDrop(i);
    }

    public void calculerScoreDragDrop(Jeu jeu, int i, int nombreErreurs, int temps) {
        modele.calculerScoreDragDrop(jeu, i, nombreErreurs, temps);
    }

    public int getScoreNiveau(Jeu jeu, int i) {
        return modele.getScoreNiveau(jeu, i);
    }
}
