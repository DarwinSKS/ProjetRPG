package Donjon;

import Joueur.JoueurBase;

public class DonjonCaseFactory {
    public static DonjonCase creerCase(int x, int y) {
        if ((x + y) % 3 == 0) {
            return new DonjonCaseMonstre();
        } else if ((x + y) % 5 == 0) {
            return new DonjonCasePiege();
        } else {
            return new DonjonCaseBase() {
                @Override
                public void interaction(JoueurBase joueur) {
                    System.out.println("Cette case est vide.");
                }
            };
        }
    }
}