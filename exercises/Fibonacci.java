public class Fibonacci {
    public static long recursively(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursively(n-1) + (recursively(n-2));
        }
    }

    public static long iteratively(long n) {
        long f0 = 0, f1 = 1, tmp;
        for (long i = 2; i <= n; i++) {
            tmp = f0 + f1;
            f0 = f1;
            f1 = tmp;
        }
        return f1;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.iteratively(50));
        System.out.println(Fibonacci.recursively(50));
    }
}
