package Donjon;

import java.util.HashMap;
import java.util.Map;

public class DonjonGrilleGest implements DonjonGrille {
    private final int largeur;
    private final int hauteur;
    private final Map<DonjonCoordonnee, DonjonCase> cases;

    public DonjonGrilleGest(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.cases = new HashMap<>();
        initialiserGrille();
    }

    private void initialiserGrille() {
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                cases.put(new DonjonCoordonnee(x, y), DonjonCaseFactory.creerCase(x, y));
            }
        }
    }

    @Override
    public DonjonCase obtenirCase(int x, int y) {
        return cases.get(new DonjonCoordonnee(x, y));
    }

    @Override
    public boolean estDansLaGrille(int x, int y) {
        return x >= 0 && x < largeur && y >= 0 && y < hauteur;
    }
}