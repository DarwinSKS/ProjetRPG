package Donjon;

public class DonjonDeplacementOuest extends DonjonDeplacementBase {
    public DonjonDeplacementOuest(int x, int y) {
        super(x,y);
        direction = DonjonDirection.OUEST;
    }

    @Override
    public void deplacer() {
        x--;
        direction = DonjonDirection.OUEST;
    }
}
