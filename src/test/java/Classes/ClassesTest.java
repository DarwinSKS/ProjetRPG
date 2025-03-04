package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassesTest {

    @Test
    void testAfficherClasses() {
        Classes classes = new Classes();
        assertDoesNotThrow(classes::afficherClasses);
    }

    @Test
        void testSelectionnerClasseGuerrier() {
            Classes classes = new Classes();
            classes.selectionnerClasse("Guerrier");
            Classes mannequin = new Classes("Guerrier", 150, 50, 15, 5, 12, 6, 8, 5, 10, 4);
            assertEquals(mannequin, classes);
        }

    @Test
    void testSelectionnerClasseMage() {
        Classes classes = new Classes();
        classes.selectionnerClasse("Mage");
        Classes mannequin = new Classes("Mage", 90, 150, 4, 15, 5, 12, 7, 6, 5, 10);
        assertEquals(mannequin, classes);
    }

    @Test
    void testSelectionnerClasseVoleur() {
        Classes classes = new Classes();
        classes.selectionnerClasse("Voleur");
        Classes mannequin = new Classes("Voleur",110, 70, 10, 7, 8, 7, 15, 12, 7, 6);
        assertEquals(mannequin, classes);
    }

    @Test
    void testSelectionnerClasseErreur() {
        Classes classes = new Classes();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> classes.selectionnerClasse("Inconnu"));
        assertEquals("Classe inconnue : Inconnu", exception.getMessage());
    }
}