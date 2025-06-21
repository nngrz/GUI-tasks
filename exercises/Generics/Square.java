package exercises.Generics;

public class Square implements Figure {
    private int base;

    public Square(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Square - base = " + base;
    }

    @Override
    public double getPerimiter() {
        return 4*base;
    }
}
