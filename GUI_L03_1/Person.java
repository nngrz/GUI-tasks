package GUI_L03_1;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private String peselNumber;
    private String dateOfBirth;
    private String address;

    public Person(String firstName, String lastName, String peselNumber, String dateOfBirth, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + peselNumber + "," + dateOfBirth + "," + address;
    }

    public static Person fromString(String data) {
        String[] parts = data.split(",", 5);
        return new Person(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }
}
