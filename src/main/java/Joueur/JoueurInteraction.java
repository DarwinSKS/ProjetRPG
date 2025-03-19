package Joueur;

import java.util.Scanner;

public class JoueurInteraction extends Joueur{
    private Scanner sc;

    public JoueurInteraction(Scanner sc) {
        this.sc = sc;
    }

    public String choisirNomJoueur() {
        String nomJoueur;
        while (true) {
            System.out.println("Nom : ");
            nomJoueur = sc.nextLine();

            if (nomJoueur.length() < 3 || nomJoueur.length() > 20) {
                throw new IllegalArgumentException("Le nom doit avoir entre 3 et 20 caractères.");
            }

            if (!nomJoueur.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Le nom ne doit contenir que des lettres.");
            }

            break;
        }
        return nomJoueur;
    }

    public String choisirUneClasse() {
        System.out.println("Liste des classes: ");
        afficherClasses();

        String nomClasse;
        do {
            System.out.println("Choisir une classe (guerrier, mage, voleur) : ");
            nomClasse = sc.nextLine().toLowerCase();

            if (nomClasse.equals("guerrier") || nomClasse.equals("mage") || nomClasse.equals("voleur")) {
                break;
            } else {
                System.out.println("Classe invalide. Veuillez réessayer.");
            }
        } while (true);

        return nomClasse;
    }
}