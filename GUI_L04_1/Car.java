package GUI_L04_1;

public class Car {
    public enum Brand {
        SKODA,
        MAZDA,
        BMW,
        VOLVO
    }

    private String registrationNumber;
    private Brand brand;

    public Car(String registrationNumber, Brand brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " " + registrationNumber;
    }
}
