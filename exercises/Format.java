class B {
    private String name;
    private int age;

    public B(String s, int x) {
        name = s;
        age = x;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }
}

class D extends B {

    public D(String name) {
        super(name, 0);
    }

    @Override
    public String toString() {
        return "*"+  super.toString() + "20*";
    }
}

public class Format {
    public static void main(String[] args) {
        for (B e : new B[] {
            new B("A", 25),
            new D("Y"),
            new D("X"),
            new B("C", 32)}) {
            System.out.println(e + " ");
        }
    }
}
