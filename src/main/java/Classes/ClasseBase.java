package Classes;

import java.util.Objects;

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

    @Override
    public void perteVie(int pv) {
        this.pv -= pv;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClasseBase that = (ClasseBase) obj;
        return Objects.equals(nomClasse, that.nomClasse) &&
                pv == that.pv &&
                pm == that.pm &&
                force == that.force &&
                intelligence == that.intelligence &&
                def == that.def &&
                resMagique == that.resMagique &&
                agilite == that.agilite &&
                chance == that.chance &&
                end == that.end &&
                esprit == that.esprit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomClasse);
    }

}
