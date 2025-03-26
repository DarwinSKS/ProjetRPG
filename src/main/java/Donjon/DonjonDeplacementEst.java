package Donjon;

public class DonjonDeplacementEst extends DonjonDeplacementBase {
    public DonjonDeplacementEst(int x, int y) {
        super(x, y);
        direction = DonjonDirection.EST;
    }

    @Override
    public void deplacer() {
        x++;
        direction = DonjonDirection.EST;
    }
}
