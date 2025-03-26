package Classes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ClassesTest {

    @Test
    void testSelectionnerClasseGuerrier() {
        ClasseBase guerrier = new ClasseGuerrier();
        guerrier.selectionnerClasse("guerrier");
        ClasseBase mannequin = new ClasseGuerrier();
        assertEquals(mannequin, guerrier);
    }

    @Test
    void testSelectionnerClasseMage() {
        ClasseBase mage = new ClasseMage();
        mage.selectionnerClasse("mage");
        ClasseBase mannequin = new ClasseMage();
        assertEquals(mannequin, mage);
    }

    @Test
    void testSelectionnerClasseVoleur() {
        ClasseBase voleur = new ClasseVoleur();
        voleur.selectionnerClasse("voleur");
        ClasseBase mannequin = new ClasseVoleur();
        assertEquals(mannequin, voleur);
    }

    @Test
    void testSelectionnerClasseErreur() {
        ClasseBase guerrier = new ClasseGuerrier();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> guerrier.selectionnerClasse("inconnu"));
        assertEquals("Classe non reconnue.", exception.getMessage());
    }
}