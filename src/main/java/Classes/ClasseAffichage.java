package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class ClasseAffichage implements ClasseAffich {
    private ClasseGestion classeGestion;

    public ClasseAffichage(ClasseGestion classeGestion) {
        this.classeGestion = classeGestion;
    }

    @Override
    public void afficherDetailClasse(ClasseBase classe) {
        System.out.println("Nom : " + classe.nomClasse);
        System.out.println("PV : " + classe.pv);
        System.out.println("PM : " + classe.pm);
        System.out.println("Force : " + classe.force);
        System.out.println("Intelligence : " + classe.intelligence);
        System.out.println("Défense : " + classe.def);
        System.out.println("Résistance magique : " + classe.resMagique);
        System.out.println("Agilité : " + classe.agilite);
        System.out.println("Chance : " + classe.chance);
        System.out.println("Endurance : " + classe.end);
        System.out.println("Esprit : " + classe.esprit);
    }

    @Override
    public void afficherClasses() {
        for (String classe : classeGestion.listeClasses()) {
            System.out.println(classe);
        }
    }
}
