package Joueur;

import java.util.Scanner;

public class Joueur extends Classes.Classes {
    private String nomClasse;
    private String nomJoueur;

    public Joueur(String nom, String classeNom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        super(classeNom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, esprit);
        this.nomClasse = classeNom;
        this.nomJoueur = nom;
    }

    public Joueur(){}

    public void choisirNomJoueur() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nom : ");
            nomJoueur = sc.nextLine();

            if (nomJoueur.length() < 3 || nomJoueur.length() > 20) {
                System.out.println("Le nom doit avoir entre 3 et 20 caractères.");
                continue;
            }

            if (!nomJoueur.matches("[a-zA-Z]+")) {
                System.out.println("Le nom ne doit contenir que des lettres.");
                continue;
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
        System.out.println("Choisir une classe : ");
        nomClasse = sc.nextLine();
        if (nomClasse.equals("Guerrier") || nomClasse.equals("Mage") || nomClasse.equals("Voleur")) {
            selectionnerClasse(nomClasse);
        }
        else {
            System.out.println("Classe invalide: ");
            choisirUneClasse();
        }
        System.out.println("Détail de votre classe : ");
        afficherDetailClasse();
        validationClasse();
    }

    private void validationClasse() {
        System.out.println("Voulez vous garder votre classe (oui/non): ");
        Scanner sc2 = new Scanner(System.in);
        String reponse = sc2.nextLine();
        if (reponse.equals("non")) {
            choisirUneClasse();
        }
        else if (!reponse.equals("oui")) {
            System.out.println("Réponse invalide");
            validationClasse();
        }
        else {
            afficherNomJoueur();
            afficherDetailClasse();
            System.out.println("La partie peut commencer !");
        }
    }
}
