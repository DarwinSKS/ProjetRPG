package Donjon;

public class DonjonDeplacementNord extends DonjonDeplacementBase {
    public DonjonDeplacementNord(int x, int y) {
        super(x, y);
        direction = DonjonDirection.NORD;

    }

    @Override
    public void deplacer() {
        y ++;
        direction = DonjonDirection.NORD;
    }
}
