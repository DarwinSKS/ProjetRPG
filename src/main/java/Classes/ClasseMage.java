package Classes;

public class ClasseMage extends ClasseBase {
    public ClasseMage() {
        super("Mage", 90, 150, 4, 15, 5, 12, 7, 6, 5, 10);
    }

    @Override
    public void selectionnerClasse(String nom){
        if (nom.equalsIgnoreCase("mage")) {
            System.out.println("La classe 'Mage' est sélectionnée.\nVoici le détail de la classe : \n");
            afficherDetailClasse();
        } else {
            System.out.println("Classe non reconnue.");
        }
    }
}
