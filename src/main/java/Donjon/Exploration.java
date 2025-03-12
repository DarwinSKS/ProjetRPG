package Donjon;

import java.util.*;
import Joueur.Joueur;

public class Exploration {
    private Joueur joueur;
    private Salle position;
    private Scanner scanner = new Scanner(System.in);

    public Exploration(Joueur joueur, Salle depart) {
        this.joueur = joueur;
        this.position = depart;
    }

    public void explorer() {
        while (true) {
            System.out.println("Vous êtes dans " + position.description);
            if (position.contientMonstre) {
                System.out.println("Un monstre bloque votre chemin ! Vous devez le combattre.");
                combattreMonstre();
                position.contientMonstre = false;
            }

            if (position.contientTresor) {
                System.out.println("Vous trouvez un trésor ! Bravo !");
                position.contientTresor = false;
            }

            System.out.println("Sorties disponibles : " + position.connexions.keySet());
            System.out.print("Où voulez-vous aller ? (nord/sud/est/ouest) : ");
            String direction = scanner.nextLine();

            if (position.connexions.containsKey(direction)) {
                position = position.connexions.get(direction);
            } else {
                System.out.println("Direction invalide. Essayez encore.");
            }
        }
    }

    private void combattreMonstre() {
        System.out.println("Vous combattez le monstre...");
        System.out.println("Vous avez vaincu le monstre !");
    }
}
