package GUI_L04_1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

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

        // Create List of cars for Smith
        List<Car> carForSmith = new ArrayList<>();
        carForSmith.add(skoda1);
        carForSmith.add(bmw);

        // Create List of cars for Jones
        List<Car> carForJones = new ArrayList<>();
        carForJones.add(mazda2);

        // Create List of cars for Harry
        List<Car> carForHarry = new ArrayList<>();
        carForHarry.add(volvo);
        carForHarry.add(mazda1);
        carForHarry.add(skoda2);

        // Create List of cars for Jacob
        List<Car> carForJacob = new ArrayList<>(); // Leave the list empty to represent no cars

        // Map each person and their cars
        Map<Person, List<Car>> carMap = new LinkedHashMap<>();

        carMap.put(smith, carForSmith);
        carMap.put(jones, carForJones);
        carMap.put(harry, carForHarry);
        carMap.put(jacob, carForJacob);

        System.out.println(carMap);

        for (Map.Entry<Person, List<Car>> entry : carMap.entrySet()) {
            Person owner = entry.getKey();
            List<Car> cars = entry.getValue();
            if (cars.isEmpty()) {
                System.out.println(owner + " -> [No cars]");
            } else {
                System.out.println(owner + " -> " + entry.getValue());
            }
        }

        // Find cars while registration numbers begin with "WA"
        System.out.println("Cars whose registration numbers begin with WA: ");

        List<Car> allCars = new ArrayList<>();
        allCars.add(skoda1);
        allCars.add(skoda2);
        allCars.add(mazda1);
        allCars.add(mazda2);
        allCars.add(bmw);
        allCars.add(volvo);

        for (Car car : allCars) {
            if (car.getRegistrationNumber().startsWith("WA")) {
                System.out.println(car);
            }
        }

        // Johns's car
        System.out.println(carMap.get(jones).get(0));
    }
}
