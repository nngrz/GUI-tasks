package exercises.EmployeeManager;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // create employee objects
        Employee Doe = new Employee("John", "Doe");
        Employee Smith = new Employee("Jane", "Smith");
        Employee Johnson = new Employee("Mary", "Johnson");
        Employee Brown = new Employee("Mike", "Brown");

        // add employee to the list
        employees.add(Doe);
        employees.add(Smith);
        employees.add(Johnson);

        System.out.println("Initial list: " + employees);

        // Insert "Mike Brown" at index 1
        employees.add(1, Brown);

        // Remove "Jane Smith"
        employees.remove(Smith);

        // Check if "Mary Johnson" exists
        System.out.println("Is Mary Johnson in the list? " + employees.contains(Johnson));

        System.out.println("Updated list: " + employees);
    }
}
