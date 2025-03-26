import Joueur.*;
import Donjon.*;
import Classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JoueurInteraction joueurInteraction = new JoueurInteraction(scanner);
        String nomJoueur = joueurInteraction.choisirNomJoueur();
        ClasseBase classeJoueur = joueurInteraction.choisirUneClasse();
        JoueurBase joueur = new JoueurBase(nomJoueur, classeJoueur);
        //JoueurAffich joueurAffich = new JoueurAffich(joueur, new ClasseAffichage(new ClasseGestion() {}));
        //joueurAffich.afficherNomJoueur();
        //joueurAffich.afficherClasse();
        int largeur = 5;
        int hauteur = 5;
        DonjonGrilleGest donjon = new DonjonGrilleGest(largeur, hauteur);
        DonjonCase caseActuelle = donjon.obtenirCase(2, 3);
        caseActuelle.interaction(joueur);
        scanner.close();
    }
}