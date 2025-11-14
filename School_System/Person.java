package School_System;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sayHelloTo(Object object) {
        return "Hi " + object.getName() + "!";
    }

    public String getName() {
        return name;
    }

}
