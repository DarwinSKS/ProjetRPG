package Joueur;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JoueurTest {

    @Test
    public void testNomValide() {
        Joueur joueur = new Joueur("NomJoueur", "Guerrier", 100, 50, 10, 10, 10, 10, 10, 10, 10);

        joueur.choisirNomJoueur("ValidName");

        assertEquals("ValidName", joueur.getNomJoueur());
    }

    @Test
    public void testNomTropCourt() {
        Joueur joueur = new Joueur("NomJoueur", "Guerrier", 100, 50, 10, 10, 10, 10, 10, 10, 10);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            joueur.choisirNomJoueur("AB");
        });

        assertEquals("Le nom doit avoir entre 3 et 20 caractères.", exception.getMessage());
    }

    @Test
    public void testNomTropLong() {
        Joueur joueur = new Joueur("NomJoueur", "Guerrier", 100, 50, 10, 10, 10, 10, 10, 10, 10);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            joueur.choisirNomJoueur("ThisNameIsWayTooLong");
        });

        assertEquals("Le nom doit avoir entre 3 et 20 caractères.", exception.getMessage());
    }

    @Test
    public void testSelectionClasseValide() {
        Joueur joueur = new Joueur("NomJoueur", "Guerrier", 100, 50, 10, 10, 10, 10, 10, 10, 10);

        joueur.choisirUneClasse("Guerrier");

        assertEquals("Guerrier", joueur.getNomClasse());
    }

    // Test d'acceptation 5.1 : Affichage du récapitulatif du personnage
    @Test
    public void testAffichageRécapitulatif() {
        Joueur joueur = new Joueur("NomJoueur", "Guerrier", 100, 50, 10, 10, 10, 10, 10, 10, 10);

        joueur.choisirNomJoueur("ValidName");
        joueur.choisirUneClasse("Guerrier");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        joueur.afficherNomJoueur();
        joueur.afficherDetailClasse();

        String output = baos.toString();

        assertTrue(output.contains("Votre nom : ValidName"));
        assertTrue(output.contains("Détail de votre classe :"));
    }

    public class Joueur extends Classes.Classes {
        private String nomClasse;
        private String nomJoueur;

        public Joueur(String nom, String classeNom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end) {
            super(classeNom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, 10);  // Supposons que esprit est un champ dans la superclasse
            this.nomClasse = classeNom;
            this.nomJoueur = nom;
        }

        public void choisirNomJoueur(String nom) {
            if (nom.length() < 3 || nom.length() > 20) {
                throw new IllegalArgumentException("Le nom doit avoir entre 3 et 20 caractères.");
            }

            if (!nom.matches("[a-zA-Z]+")) {
                throw new IllegalArgumentException("Le nom ne doit contenir que des lettres.");
            }

            this.nomJoueur = nom;
        }

        public String getNomJoueur() {
            return nomJoueur;
        }

        public void choisirUneClasse(String classe) {
            if (classe.equals("Guerrier") || classe.equals("Mage") || classe.equals("Voleur")) {
                this.nomClasse = classe;
            } else {
                throw new IllegalArgumentException("Classe invalide");
            }
        }

        public String getNomClasse() {
            return nomClasse;
        }

        public void afficherNomJoueur() {
            System.out.println("Votre nom : " + nomJoueur);
        }

        public void afficherDetailClasse() {
            System.out.println("Détail de votre classe : " + nomClasse);
        }
    }
}
