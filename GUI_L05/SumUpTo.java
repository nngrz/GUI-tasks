package GUI_L05;

import java.util.Scanner;

public class SumUpTo {

    public static int sumUpTo(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUpTo(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Sum from 1 to " + number + " is " + sumUpTo(number));
        }

        scanner.close();
    }
}
