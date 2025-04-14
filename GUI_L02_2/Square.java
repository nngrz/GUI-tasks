package GUI_L02_2;

class Square extends Rectangle {
    private double side;

    public Square(double side, String color) {
        super(side, side, color); // Call the Rectangle constructor with equal length and width 
        this.side = side;
    }
}
