package exercises.Generics;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(3, 5, 8);

        // FigureBox<Square> squareFigureBox = new FigureBox<Square>(square);
        // FigureBox<Circle> circleFigureBox = new FigureBox<Circle>(circle);
        // FigureBox<Triangle> triangleFigureBox = new FigureBox<Triangle>(triangle);

        FigureBox<Square> squareFigureBox = new FigureBox<>(square);
        FigureBox<Circle> circleFigureBox = new FigureBox<>(circle);
        FigureBox<Triangle> triangleFigureBox = new FigureBox<>(triangle);

        System.out.println(squareFigureBox);
        System.out.println(circleFigureBox);
        System.out.println(triangleFigureBox);

        Inscribed<Square, Circle> inscribed = new Inscribed<>(square, circle);
        System.out.println(inscribed);

        Inscribed<FigureBox<Square>, FigureBox<Circle>> inscribed1 = new Inscribed<>(squareFigureBox, circleFigureBox);
        System.out.println(inscribed1);
    }
}
