package GUI_L02_3;

public class Square implements Comparable<Square>, Figure {
    private int length;
    private int number;

    public static int counter = 0;

    public Square(int length) throws TooBigSquareException {
        if (length > max) {
            throw new TooBigSquareException("Maximum length is " + max);
        }
        this.length = length;
        this.number = ++counter;
    }

    @Override
    public int getArea() {
        return length * length;
    }

    @Override 
    public int getPerimeter() {
        return 4 * length;
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
