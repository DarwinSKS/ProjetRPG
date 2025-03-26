package Classes;

public class ClasseGuerrier extends ClasseBase {
    public ClasseGuerrier() {
        super("Guerrier", 150, 50, 15, 5, 12, 6, 8, 5, 10, 4);
    }

    @Override
    public void selectionnerClasse(String nom) {
        if (nom.equalsIgnoreCase("guerrier")) {
            System.out.println("La classe 'Guerrier' est sélectionnée.\nVoici le détail de la classe : \n");
        } else {
            throw new IllegalArgumentException("Classe non reconnue.");
        }
    }
}
