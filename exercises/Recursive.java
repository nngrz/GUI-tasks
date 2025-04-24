class Factorial {
    
        public static int recursively(int n) {
            if (n == 0) {
                return 1;
            } else
                return n * recursively(n - 1);
        }
    
        public static int iteratively(int n) {
            int result = 1;
            for (int j = 1; j <= n; j++) {
                result *= j;
            }
            return result;
        }
    }

public class Recursive {

    public static void main(String[] args) {
        System.out.println(Factorial.recursively(5));
        System.out.println(Factorial.iteratively(5));
    }
}
