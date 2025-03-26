package Donjon;

import Joueur.JoueurBase;

public class DonjonCaseMonstre extends DonjonCaseBase {
    public DonjonCaseMonstre (){
        monstre = true;
        piege = true;
    }

    @Override
    public void interaction(JoueurBase joueur) {
        System.out.println("Vous êtes tombé sur un monstre !");
        joueur.classeJoueur.perteVie(30);
        System.out.println("Vous avez perdu 30 points de vie !");
    }
}
