package Joueur;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JoueurTest {

    @Test
    public void testNomValide() {
        Joueur joueur = new Joueur();
        String input = "Test";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        joueur.choisirNomJoueur();
        joueur.afficherNomJoueur();

        assertTrue(outputStream.toString().contains("Votre nom : Test"));

        System.setOut(System.out);
    }

    @Test
    public void testNomTropCourt() {
        Joueur joueur = new Joueur();
        String inputTropCourt = "Te";

        System.setIn(new ByteArrayInputStream(inputTropCourt.getBytes()));

        Exception exception = assertThrows(IllegalArgumentException.class, joueur::choisirNomJoueur);

        assertTrue(exception.getMessage().contains("Le nom doit avoir entre 3 et 20 caractères."));
    }

    @Test
    public void testNomTropLong(){
        Joueur joueur = new Joueur();
        String inputTropLong = "aaaaaaaaaaaaaaaaaaaaa";

        System.setIn(new ByteArrayInputStream(inputTropLong.getBytes()));

        Exception exception = assertThrows(IllegalArgumentException.class, joueur::choisirNomJoueur);

        assertTrue(exception.getMessage().contains("Le nom doit avoir entre 3 et 20 caractères."));
    }

    @Test
    public void testNomAvecChiffres() {
        Joueur joueur = new Joueur();
        String inputChiffres = "Test123";

        System.setIn(new ByteArrayInputStream(inputChiffres.getBytes()));

        Exception exception = assertThrows(IllegalArgumentException.class, joueur::choisirNomJoueur);

        assertTrue(exception.getMessage().contains("Le nom ne doit contenir que des lettres."));
    }

    @Test
    public void testChoisirUneClasseValide() {
        Joueur joueur = new Joueur();
        String input = "guerrier\noui";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        joueur.choisirUneClasse();

        assertTrue(outputStream.toString().contains("La partie peut commencer !"));

        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void testChoisirUneClasseInvalide() {
        Joueur joueur = new Joueur();
        String input = "test\nvoleur\noui";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        joueur.choisirUneClasse();

        assertTrue(outputStream.toString().contains("Classe invalide. Veuillez réessayer."));

        System.setOut(System.out);
        System.setIn(System.in);

    }

}
