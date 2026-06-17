class Outer {

    private int x = 10;
    static int staticValue = 20;

    class Inner {
        void show() {
            System.out.println("Normal inner print: x from outer is " + x);
        }
    }

    static class Nested {
        void showNested(Outer outer) {
            System.out.println("Static inner print: x from outer is " + outer.x);
            System.out.println("Static inner print: staticValue from outer is " + staticValue);
        }
    }
}

public class InnerOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
        Outer.Nested staticInner = new Outer.Nested();
        staticInner.showNested(outer);
    }
}
