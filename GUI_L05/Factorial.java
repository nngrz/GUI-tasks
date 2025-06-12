package GUI_L05;

public class Factorial {

    public static int factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        if (n > 1) {
            return n * factorial(n - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
    }
}
