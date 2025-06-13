package GUI_L04_1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person smith = new Person("Oliver", "Smith");
        Person jones = new Person("Jack", "Jones");
        Person harry = new Person("Harry", "Williams");
        Person jacob = new Person("Jacob", "Brown");

        Car skoda1 = new Car("WA00001", Car.Brand.SKODA);
        Car skoda2 = new Car("SC36010", Car.Brand.SKODA);
        Car mazda1 = new Car("WA01234", Car.Brand.MAZDA);
        Car mazda2 = new Car("DW01ASD", Car.Brand.MAZDA);
        Car bmw = new Car("WA12690", Car.Brand.BMW);
        Car volvo = new Car("KR60606", Car.Brand.VOLVO);

        Map<Person, List<Car>> carMap = new LinkedHashMap<>();

        carMap.put(smith, List.of(skoda1, bmw));
        carMap.put(jones, List.of(mazda2));
        carMap.put(harry, List.of(volvo, mazda1, skoda2));
        carMap.put(jacob, List.of()); // No cars

        for (Map.Entry<Person, List<Car>> entry : carMap.entrySet()) {
            Person owner = entry.getKey();
            List<Car> cars = entry.getValue();
            if (cars.isEmpty()) {
                System.out.println(owner + " -> [ No cars ]");
            } else {
                System.out.println(owner + "-> ");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.print(cars.get(i));
                    if (i < cars.size() - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }

        System.out.println("Johns' car: " + carMap.get(jones).get(0));

        System.out.println("Cars whose registration numbers begin with WA: ");

        for (List<Car> cars : carMap.values()) {
            for (Car car : cars) {
                if (car.getRegistrationNumber().startsWith("WA")) {
                    System.out.println(car);
                }
            }
        }

        /*
        Why do i need two loops for (List<Car> cars : carMap.values()) and for (Car car : cars):

        I have a Map<Person, List<Car>> carMap, which means:

        Each key is a Person.
        Each value is a List<Car> (a list of that person's cars).

        So when i do: for (List<Car> cars : carMap.values()),
        i am iterating through all the lists of cars in the map belongs to a person. For example:
        [
            [SKODA WA00001, BMW WA12690],      // for Oliver
            [MAZDA DW01ASD],                   // for Jack
            [VOLVO KR60606, MAZDA WA01234],   // for Harry
            []                                 // for Jacob
        ]
        Each cars is one of those lists.

        Because each cars is a list, to look at the individual cars inside the list, i need:
        for (Car car : cars)
        This second loop goes through each individual Car object inside each list.

        Summary:
        for (List<Car> cars : ...)	Goes through each person’s list of cars
        for (Car car : cars)	Goes through each individual car in that list
        */
    }
}
