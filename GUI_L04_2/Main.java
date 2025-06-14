package GUI_L04_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String largestCompany = null;
        int maxEmployees = 0;

        String[] arr = {
            "office A", "John", "Doe",
            "office B", "John", "Brown",
            "office C", "Mary", "Jones",
            "office B", "Adam", "Rust",
            "office C", "Cindy", "Frost",
            "office A", "Kate", "Coe",
            "office A", "Bill", "Brown",
        };

        // Create a set of company
        Set<String> company = new HashSet<>();

        // Create company and people map
        Map<String, List<Person>> companyPeople = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith("office")) {
                String office = arr[i];
                String firstName = arr[i+1];
                String lastName = arr[i+2];

                company.add(office);
                Person personObject = new Person(firstName, lastName);

                // Add person to company
                companyPeople
                    .computeIfAbsent(office, k -> new ArrayList<>())
                    .add(personObject);
            }
        }

        System.out.println(company);
        System.out.println(companyPeople);

       for (Map.Entry<String, List<Person>> entry : companyPeople.entrySet()) {
            int size = entry.getValue().size();
            String office = entry.getKey();

            if (size > maxEmployees) {
                maxEmployees = size;
                largestCompany = office;
            }
       }
       System.out.println(largestCompany + ": " + maxEmployees + " users");
    }
}
