package Classes;

public abstract class ClasseBase implements Classe {
    private String nom;
    private int pv;
    private int pm;
    private int force;
    private int intelligence;
    private int def;
    private int resMagique;
    private int agilite;
    private int chance;
    private int end;
    private int esprit;

    public ClasseBase(String nom, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
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

    @Override
    public void afficherDetailClasse() {
        System.out.println("Nom : " + nom);
        System.out.println("PV : " + pv);
        System.out.println("PM : " + pm);
        System.out.println("Force : " + force);
        System.out.println("Intelligence : " + intelligence);
        System.out.println("Défense : " + def);
        System.out.println("Résistance magique : " + resMagique);
        System.out.println("Agilité : " + agilite);
        System.out.println("Chance : " + chance);
        System.out.println("Endurance : " + end);
        System.out.println("Esprit : " + esprit);
    }

    @Override
    public void afficherClasses() {
        System.out.println("Guerrier");
        System.out.println("Mage");
        System.out.println("Voleur");
    }

}
