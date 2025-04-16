package exercises.Inheritance;

public class Employee extends Person {
    
    public Employee (String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Employee name is " + super.toString();
    }
}
