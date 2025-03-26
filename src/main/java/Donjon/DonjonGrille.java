package Donjon;

public interface DonjonGrille {
    DonjonCase obtenirCase(int x, int y);
    boolean estDansLaGrille(int x, int y);
}
