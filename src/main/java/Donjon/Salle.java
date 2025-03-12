package Donjon;

import java.util.*;

public class Salle {
    String description;
    boolean contientMonstre;
    boolean contientTresor;
    Map<String, Salle> connexions = new HashMap<>();

    public Salle(String description, boolean monstre, boolean tresor) {
        this.description = description;
        this.contientMonstre = monstre;
        this.contientTresor = tresor;
    }
}
