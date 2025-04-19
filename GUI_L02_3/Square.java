package GUI_L02_3;

public class Square implements Comparable<Square> {
    private int length;
    private int number;

    static int counter = 0;

    public Square(int length) {
        this.length = length;
        this.number = ++counter;
    }

    public int getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "(" + number + "):" + getArea();
    }

    @Override
    public int compareTo(Square other) {
        return Integer.compare(this.getArea(), other.getArea());
    }
}
