package File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTab {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        File file = new File("tab.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    numbers.add(sc.nextInt());
                } else {
                    sc.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tab.txt not found");
            return;
        }

        if (numbers.isEmpty()) {
            System.out.println();
            System.out.println("No numbers");
            System.out.println();
            return;
        }

        // The 1st line: print all numbers
        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers.get(i));
        }
        System.out.println();

        // Find the max number
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        // The 2nd line: print the max number
        System.out.println(max);

        // The 3rd line: print the indices at which the max number appears in the collection
        boolean first = true;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == max) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
