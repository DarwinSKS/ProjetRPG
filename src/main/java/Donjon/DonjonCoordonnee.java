package Donjon;

import java.util.Objects;

public class DonjonCoordonnee {
    protected int x;
    protected int y;

    public DonjonCoordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonjonCoordonnee that = (DonjonCoordonnee) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
