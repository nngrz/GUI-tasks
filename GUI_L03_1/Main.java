package GUI_L03_1;

import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

    private static final String TEXT_FILE = "pesons.txt";
    private static final String BYTE_FILE = "persons_bytes.dat";
    private static final String SERIAL_FILE = "persons_serial.dat";
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("How many people?");
        int n = userInput.nextInt();
        userInput.nextLine(); // fix for skipping input

        for (int i = 0; i < n; i++) {

            System.out.println("First name: ");
            String firstName = userInput.nextLine();

            System.out.println("Last name: ");
            String lastName = userInput.nextLine();

            System.out.println("PESEL number: ");
            String peselNumber = userInput.nextLine();

            System.out.println("Date of birth(dd/mm/yy): ");
            String dateOfBirth = userInput.nextLine();

            System.out.println("Address: ");
            String address = userInput.nextLine();

            Person person = new Person(firstName, lastName, peselNumber, dateOfBirth, address);

            people.add(person);
        }

        userInput.close();

        System.out.println(people);

        saveAsText(people);
        saveAsBytes(people);
        saveAsSerialized(people);

        System.out.println("\n--- Loaded from Text File ---");
        loadFromText().forEach(System.out::println);

        System.out.println("\n--- Loaded from Byte File ---");
        loadFromBytes().forEach(System.out::println);

        System.out.println("\n--- Loaded from Serialized File ---");
        loadFromSerialized().forEach(System.out::println);

        System.out.println("\n--- File Sizes ---");
        System.out.println("Text file: " + new File(TEXT_FILE).length() + " bytes");
        System.out.println("Byte file: " + new File(BYTE_FILE).length() + " bytes");
        System.out.println("Serialized file: " + new File(SERIAL_FILE).length() + " bytes");
    }

    // Text mode
    public static void saveAsText(List<Person> people) throws IOException {
        try (PrintWriter writer = new PrintWriter(TEXT_FILE)) {
            for (Person p : people) {
                writer.println(p.toString());
            }
        }
    }

    public static List<Person> loadFromText() throws IOException {
        List<Person> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Person.fromString(line));
            }
        }
        return list;
    }

    // Byte mode
    public static void saveAsBytes(List<Person> people) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(BYTE_FILE)) {
            for (Person p : people) {
                fos.write(p.toString().getBytes());
                fos.write('\n');
            }
        }
    }

    public static List<Person> loadFromBytes() throws IOException {
        List<Person> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(BYTE_FILE);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Person.fromString(line));
            }
        }
        return list;
    }

    // Serialization
    public static void saveAsSerialized(List<Person> people) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(people);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Person> loadFromSerialized() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            return (List<Person>) ois.readObject();
        }
    }
}
