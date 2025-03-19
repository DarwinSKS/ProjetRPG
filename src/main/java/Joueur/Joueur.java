package Joueur;

public class Joueur extends Classes.Classes {
    private String nomJoueur;

    public Joueur(String nom, String classeNom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        super(classeNom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, esprit);
        this.nomJoueur = nom;
    }

    public Joueur() {}

}