package Joueur;

import Classes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JoueurInteractionTest {
    private JoueurInteraction joueurInteraction;
    private Scanner mockScanner;
    private ClasseAffichage mockClasseAffichage;

    @BeforeEach
    void setUp() {
        mockScanner = mock(Scanner.class);
        mockClasseAffichage = mock(ClasseAffichage.class);

        joueurInteraction = new JoueurInteraction(mockScanner) {
        };
    }

    @Test
    void testChoisirNomJoueur() {
        when(mockScanner.nextLine()).thenReturn("TestJoueur");
        String nom = joueurInteraction.choisirNomJoueur();
        assertEquals("TestJoueur", nom);
    }

    @Test
    void testChoisirUneClasse_Guerrier() {
        when(mockScanner.nextLine()).thenReturn("guerrier");
        ClasseBase classe = joueurInteraction.choisirUneClasse();
        assertTrue(classe instanceof ClasseGuerrier);
    }

    @Test
    void testChoisirUneClasse_Mage() {
        when(mockScanner.nextLine()).thenReturn("mage");
        ClasseBase classe = joueurInteraction.choisirUneClasse();
        assertTrue(classe instanceof ClasseMage);
    }

    @Test
    void testChoisirUneClasse_Voleur() {
        when(mockScanner.nextLine()).thenReturn("voleur");
        ClasseBase classe = joueurInteraction.choisirUneClasse();
        assertTrue(classe instanceof ClasseVoleur);
    }

    @Test
    void testChoisirUneClasse_Invalide() {
        when(mockScanner.nextLine()).thenReturn("inconnu");
        ClasseBase classe = joueurInteraction.choisirUneClasse();
        assertNull(classe);
    }
}
