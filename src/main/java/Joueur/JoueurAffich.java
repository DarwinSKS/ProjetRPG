package Joueur;

import Classes.ClasseAffichage;

public abstract class JoueurAffich implements JoueurAffichage {
    private JoueurBase joueur;
    private ClasseAffichage classeAffichage;

    public JoueurAffich(JoueurBase joueur, ClasseAffichage classeAffichage) {
        this.joueur = joueur;
        this.classeAffichage = classeAffichage;
    }

    @Override
    public void afficherNomJoueur() {
        System.out.println("Votre nom : " + joueur.nomJoueur);
    }

    public void afficherClasse() {
        System.out.println("Votre classe : " + joueur.classeJoueur);
        classeAffichage.afficherDetailClasse(joueur.classeJoueur);
    }
}
