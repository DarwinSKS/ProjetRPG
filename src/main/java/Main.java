import Joueur.Joueur;
import Donjon.*;

public class Main {
    public static void main(String[] args) {

        Joueur joueurtest = new Joueur();
        joueurtest.choisirNomJoueur();
        joueurtest.afficherNomJoueur();
        joueurtest.choisirUneClasse();


        Donjon donjon = new Donjon(5);
        Exploration exploration = new Exploration(joueurtest, donjon.salles.get(0));
        exploration.explorer();

    }
}
