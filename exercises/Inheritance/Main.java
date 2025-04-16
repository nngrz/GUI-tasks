package exercises.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Al","Bali");
        Person employee = new Employee("Ni","Zh");
        System.out.println(person.toString());
        System.out.println(employee.toString());
    }
}
