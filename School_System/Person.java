package School_System;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person p) {
        System.out.println( "Hi " + p.getName() + "!");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
