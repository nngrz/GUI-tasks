package exercises.Generics;

public class Circle implements Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle - radius = " + radius;
    }

    @Override
    public double getPerimiter() {
        return 2*Math.PI*radius;
    }
}
