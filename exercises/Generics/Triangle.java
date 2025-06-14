package exercises.Generics;

public class Triangle implements Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle - a = " + a + "; b = " + b + "; c = " + c;
    }

    @Override
    public double getPerimiter() {
        return a+b+c;
    }
}
