package GUI_L02_2;

class Hexagon extends Figure{
    private double side;

    public Hexagon(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((3 * Math.sqrt(3))/2) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }
}
