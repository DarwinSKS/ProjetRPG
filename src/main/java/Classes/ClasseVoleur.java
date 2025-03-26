package Classes;

public class ClasseVoleur extends ClasseBase{
    public ClasseVoleur() {
        super("Voleur", 110, 70, 10, 7, 8, 7, 15, 12, 7, 6);
    }

    @Override
    public void selectionnerClasse(String nom) {
        if (nom.equalsIgnoreCase("voleur")) {
            System.out.println("La classe 'Voleur' est sélectionnée.\nVoici le détail de la classe : \n");
        } else {
            throw new IllegalArgumentException("Classe non reconnue.");
        }
    }
}
