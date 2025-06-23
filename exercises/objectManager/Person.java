package exercises.objectManager;

import java.io.Serializable;

public class Person implements Serializable {

    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
