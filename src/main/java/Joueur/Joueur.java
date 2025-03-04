package Joueur;

import java.util.Scanner;

public class Joueur extends Classes.Classes {
    private String nomJoueur;

    public Joueur(String nom, String classeNom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        super(classeNom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, esprit);
        this.nomJoueur = nom;
    }

    public Joueur(){}

    public void choisirNomJoueur() {
        Scanner sc = new Scanner(System.in);

        while(true) {
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
    }

    public void afficherNomJoueur() {
        System.out.println("Votre nom : " + nomJoueur);
    }

    public void choisirUneClasse() {
        System.out.println("Liste des classes: ");
        afficherClasses();

        Scanner sc = new Scanner(System.in);
        String nomClasse;

        do {
            System.out.println("Choisir une classe (guerrier, mage, voleur) : ");
            nomClasse = sc.nextLine().toLowerCase();

            if (nomClasse.equals("guerrier") || nomClasse.equals("mage") || nomClasse.equals("voleur")) {
                selectionnerClasse(nomClasse);
                break;
            } else {
                System.out.println("Classe invalide. Veuillez réessayer.");
            }
        } while (true);

        System.out.println("Détail de votre classe : ");
        afficherDetailClasse();

        validationClasse(sc);
    }

    private void validationClasse(Scanner sc) {
        String reponse;

        do {
            System.out.println("Voulez-vous garder votre classe (oui/non) ? ");
            reponse = sc.nextLine().toLowerCase();

            if (reponse.equals("oui")) {
                afficherNomJoueur();
                afficherDetailClasse();
                System.out.println("La partie peut commencer !");
                break;
            } else if (reponse.equals("non")) {
                choisirUneClasse();
                break;
            } else {
                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");
            }
        } while (true);
    }
}
