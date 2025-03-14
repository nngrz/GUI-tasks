package task1;

public class Person {
    private String name;

    public Person(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHelloTo(Person other) {
        System.out.println("Hi " + other.getName() + " !");
    }
}
