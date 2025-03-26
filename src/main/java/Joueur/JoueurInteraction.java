package Joueur;

import Classes.*;

import java.util.Scanner;

public class JoueurInteraction implements JoueurInterac {
    private Scanner sc;
    private ClasseAffichage classeAffichage;

    public JoueurInteraction(Scanner scanner) {
        this.sc = scanner;
    }

    @Override
    public String choisirNomJoueur() {
        System.out.println("Entrez votre nom : ");
        return sc.nextLine();
    }

    @Override
    public ClasseBase choisirUneClasse() {
        System.out.println("Liste des classes disponibles : ");
        classeAffichage.afficherClasses();
        System.out.println("Choisissez votre classe : ");
        String nomClasse = sc.nextLine();
        switch (nomClasse) {
            case "guerrier":
                return new ClasseGuerrier();
            case "mage":
                return new ClasseMage();
            case "voleur":
                return new ClasseVoleur();
            default:
                System.out.println("Classe non reconnue.");
                return null;
        }
    }
}
