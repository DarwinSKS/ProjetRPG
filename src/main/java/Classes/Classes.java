package Classes;

import java.util.Objects;

public class Classes {
    private String nom; // Nom de la classe
    private int pv; // Points de Vie (PV) : Représentent la santé du personnage
    private int pm; // Points de Mana (PM) : Utilisés pour les sorts et compétences spéciales
    private int force; // Force : Dégâts des attaques physiques
    private int intelligence; // Intelligence : Efficacité des sorts magiques.
    private int def; // Défense : Réduction des dégâts physiques reçus.
    private int resMagique; // Résistance Magique : Réduction des dégâts magiques reçus.
    private int agilite; // Agilité : Vitesse d'action et capacité d'esquive.
    private int chance; // Chance : Chances de coups critiques et trouvailles rares.
    private int end; // Endurance : Résistance aux effets.
    private int esprit; // Esprit : Régénération de mana et résistance mentale.

    public Classes(String nom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        this.nom = nom;
        this.pv = pv;
        this.pm = pm;
        this.force = force;
        this.intelligence = intelligence;
        this.def = def;
        this.resMagique = resMagique;
        this.agilite = agilite;
        this.chance = chance;
        this.end = end;
        this.esprit = esprit;
    }

    public Classes() {

    }

    public void afficherClasses() {
        System.out.println("Guerrier");
        System.out.println("Voleur");
        System.out.println("Mage");
    }

    public void afficherDetailClasse() {
        System.out.println("Nom de la classe : " + this.nom);
        System.out.println("Points de Vie : " + this.pv);
        System.out.println("Points de Mana : " + this.pm);
        System.out.println("Force : " + this.force);
        System.out.println("Intelligence : " + this.intelligence);
        System.out.println("Défense : " + this.def);
        System.out.println("Résistance Magique : " + this.resMagique);
        System.out.println("Agilité : " + this.agilite);
        System.out.println("Chance : " + this.chance);
        System.out.println("Endurance : " + this.end);
        System.out.println("Esprit : " + this.esprit);
    }

    public void selectionnerClasse(String nom) {
        if (!nom.equals("Guerrier") && !nom.equals("Mage") && !nom.equals("Voleur")) {
            throw new IllegalArgumentException("Classe inconnue : " + nom);
        }

        switch (nom) {
            case "Guerrier":
                this.nom = "Guerrier";
                this.pv = 150;
                this.pm = 50;
                this.force = 15;
                this.intelligence = 5;
                this.def = 12;
                this.resMagique = 6;
                this.agilite = 8;
                this.chance = 5;
                this.end = 10;
                this.esprit = 4;
                break;
            case "Mage":
                this.nom = "Mage";
                this.pv = 90;
                this.pm = 150;
                this.force = 4;
                this.intelligence = 15;
                this.def = 5;
                this.resMagique = 12;
                this.agilite = 7;
                this.chance = 6;
                this.end = 5;
                this.esprit = 10;
                break;
            case "Voleur":
                this.nom = "Voleur";
                this.pv = 110;
                this.pm = 70;
                this.force = 10;
                this.intelligence = 7;
                this.def = 8;
                this.resMagique = 7;
                this.agilite = 15;
                this.chance = 12;
                this.end = 7;
                this.esprit = 6;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return pv == classes.pv && pm == classes.pm && force == classes.force && intelligence == classes.intelligence && def == classes.def && resMagique == classes.resMagique && agilite == classes.agilite && chance == classes.chance && end == classes.end && esprit == classes.esprit && Objects.equals(nom, classes.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pv, pm, force, intelligence, def, resMagique, agilite, chance, end, esprit);
    }
}

