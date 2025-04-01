package GUI_L02_2;

import java.text.DecimalFormat;

abstract class Figure {
    private String color;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Color - " + color + ", Area - " + df.format(getArea()) + ", Perimeter - " + df.format(getPerimeter());
    }
}
