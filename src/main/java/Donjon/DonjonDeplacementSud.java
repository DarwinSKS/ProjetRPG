package Donjon;

public class DonjonDeplacementSud extends DonjonDeplacementBase {
    public DonjonDeplacementSud(int x, int y) {
        super(x,y);
        direction = DonjonDirection.SUD;
    }

    @Override
    public void deplacer() {
        y--;
        direction = DonjonDirection.SUD;
    }
}
