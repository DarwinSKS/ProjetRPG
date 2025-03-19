package Classes;

public abstract class ClasseBase implements ClasseStats {
    protected String nomClasse;
    protected int pv;
    protected int pm;
    protected int force;
    protected int intelligence;
    protected int def;
    protected int resMagique;
    protected int agilite;
    protected int chance;
    protected int end;
    protected int esprit;

    public ClasseBase(String nomClasse, int pv, int pm, int force, int intelligence, int def, int resMagique, int agilite, int chance, int end, int esprit) {
        this.nomClasse = nomClasse;
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

}
