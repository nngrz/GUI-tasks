package exercises.point;

public class Main {
    public static void  main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2 = new Point(2,5);

        int number1 = p1.getPointNumber();
        int number2 = p2.getPointNumber();

        System.out.println("Point 1: " + p1);
        System.out.println(number1);
        System.out.println("Point 2: " + p2);
        System.out.println(number2);
    }
}
