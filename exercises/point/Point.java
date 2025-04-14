package exercises.point;

public class Point {

    // Fields
    private int x;
    private int y;
    private int pointNumber;

    // Private field
    private static int counter = 0;

    {
        // Nonstatic initialization block
        System.out.println("nonstatic initialization block");
    }

    static {
        // Static initialization block
        System.out.println("static initialization block");
    }

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        pointNumber = counter++;
        System.out.println("Constructor");
    }

    public Point() {
        this(0,0);
    }

    // Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public int getPointNumber() {
        return pointNumber;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Static method 
    public static int getCounter() {
        return counter;
    }

    //overrided method toString
    @Override
    public String toString() {
        return "Point nr " + getPointNumber() + " (" + getX() + ";" + getY() + ")";
    }
}
