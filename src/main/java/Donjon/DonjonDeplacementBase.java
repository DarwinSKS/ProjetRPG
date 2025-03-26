package Donjon;

public abstract class DonjonDeplacementBase implements DonjonDeplacement {
    protected int x;
    protected int y;
    protected DonjonDirection direction;

    public DonjonDeplacementBase(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = null;
    }

    @Override
    public void afficherDirection() {
        System.out.println("Vous regardez vers le " + direction);
    }
}
