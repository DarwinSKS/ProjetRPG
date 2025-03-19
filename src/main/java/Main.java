package Donjon;

import java.util.Random;
import java.util.Scanner;
import Joueur.Joueur;
import Joueur.JoueurInteraction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JoueurInteraction joueurInteraction = new JoueurInteraction(scanner);
        joueurInteraction.choisirNomJoueur();

        Joueur joueurtest = new Joueur();
        joueurtest.selectionnerClasse(joueurInteraction.choisirUneClasse());

        Random random = new Random();
        int nombreSalles = random.nextInt(6) + 5;
        System.out.println("Le donjon aura " + nombreSalles + " salles.");
        Donjon donjon = new Donjon(nombreSalles);
        Exploration exploration = new Exploration(joueurtest, donjon.salles.get(0));
        exploration.explorer();
    }
}