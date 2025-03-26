package Joueur;

import Classes.ClasseBase;

public class JoueurBase {
    protected String nomJoueur;
    public ClasseBase classeJoueur;

    public JoueurBase(String nomJoueur, ClasseBase classeJoueur) {
        this.nomJoueur = nomJoueur;
        this.classeJoueur = classeJoueur;
    }
}
