class Rectangle {
    private int length;
    private int width;

    public Rectangle()
    {
       length = 1;
       width = 1;
    }

    public Rectangle(int l, int w)
    {
       length = l;
       width = w;
    }

    public void draw() {
        for(int i=0; i < length; i++)
        {
            for(int j=0; j < width; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
    }

    public int area() {
        return length * width;
    }
}

class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(int side) {
        super(side, side);
    }

    public void draw(){
        super.draw();
    }

    public int area() {
        return super.area();
    }
}

public class Inherit_Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,5);
        r.draw();

        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();

        System.out.println("The area of the rectangle is " + r.area());
        System.out.println("The area of the square s1 is " + s1.area());
        System.out.println("The area of the square s is " + s.area());
    }
}
