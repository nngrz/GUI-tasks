package GUI_L02_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Square(5,"Red"));
        figures.add(new Rectangle(6, 4, "Blue"));
        figures.add(new Circle(3, "Green"));
        figures.add(new Triangle(3, 4, 5, "Yellow"));
        figures.add(new Hexagon(3, "White"));
        for (Figure f : figures) {
            System.out.println(f);
        }
    }
}
