package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class ClasseGestion implements ClasseGest {
    private List<String> listeClasses = new ArrayList<>();

    public ClasseGestion() {
        listeClasses.add("Guerrier");
        listeClasses.add("Mage");
        listeClasses.add("Voleur");
    }

    @Override
    public List<String> listeClasses() {
        return listeClasses;
    }

    @Override
    public void ajouterClasse(String nom) {
        listeClasses.add(nom);
    }

    }
