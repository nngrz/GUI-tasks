package GUI_L02_3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square[] squares = {
            new Square(8),
            new Square(3),
            new Square(4),
            new Square(2),
            new Square(6),
        };
        
        System.out.println("Before sorting: ");
        for (Square s : squares) {
            System.out.println(s);
        }

        Arrays.sort(squares);

        System.out.println("After sorting: ");
        for (Square s : squares) {
            System.out.println(s);
        }
    }
}
