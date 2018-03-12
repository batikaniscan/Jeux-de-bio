/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.vue.principale;

import ca.qc.bdeb.modele.Jeu;
import ca.qc.bdeb.controleur.Controleur;
import ca.qc.bdeb.modele.Modele;
import javax.swing.JFrame;

/**
 *
 * @author 1649904
 */
public class FenetreSelection extends JFrame {

    private Modele modele;

    private Controleur controleur;

    private FenetrePrincipale fenetrePrincipale;

    private FenetreJeu fenetreJeu;

    private MondeSelection monde;

    private Jeu jeu;

    public FenetreSelection(Modele modele, Controleur controleur, FenetrePrincipale fenetrePrincipale, Jeu jeu, FenetreJeu fenetreJeu) {
        this.modele = modele;
        this.controleur = controleur;
        this.fenetrePrincipale = fenetrePrincipale;
        this.jeu = jeu;
        this.fenetreJeu = fenetreJeu;

        creerInterface();

        this.pack();
        this.setVisible(true);

    }

    private void creerInterface() {
        this.monde = new MondeSelection(modele, controleur, this, jeu);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setTitle("Sélection de niveaux");
        this.add(monde);
    }

    public void fermerFenetreSelection() {
        fenetrePrincipale.fermerFenetreSelection();
    }

    public void ouvrirFenetreJeu(int i) {
        this.fenetreJeu = new FenetreJeu(jeu, this, fenetrePrincipale, controleur, modele, i);
    }

    public void fermerFenetreJeu() {
        this.fenetreJeu.dispose();
    }

    public void finJeu() {
        fenetrePrincipale.finJeu();
    }
}
