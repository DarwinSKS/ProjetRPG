package Donjon;

import Joueur.JoueurBase;

public class DonjonCasePiege extends DonjonCaseBase {
    public DonjonCasePiege() {
        monstre = false;
        piege = true;
    }

    @Override
    public void interaction(JoueurBase joueur) {
        System.out.println("Vous êtes tombé sur un piège !");
        joueur.classeJoueur.perteVie(20);
        System.out.println("Vous avez perdu 20 points de vie !");
    }
}
