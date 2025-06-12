package GUI_L05;

public class Fibonacci {
    
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibbonacci is undefined for negative numbers");
        }
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(fibonacci(number));
    }
}
