package Donjon;

import java.util.*;

public class Donjon {
    public List<Salle> salles = new ArrayList<>();
    Random random = new Random();

    public Donjon(int nombreSalles) {
        genererDonjon(nombreSalles);
    }

    private void genererDonjon(int nombreSalles) {
        for (int i = 0; i < nombreSalles; i++) {
            boolean monstre = random.nextBoolean();
            boolean tresor = !monstre && random.nextBoolean();
            salles.add(new Salle("Salle " + (i + 1), monstre, tresor));
        }

        for (int i = 0; i < salles.size(); i++) {
            Salle salle = salles.get(i);
            if (i > 0) salle.connexions.put("ouest", salles.get(i - 1));
            if (i < salles.size() - 1) salle.connexions.put("est", salles.get(i + 1));
        }
    }
}
