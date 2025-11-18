public class WhileExercise01 {
    public static void main(String args[]) {
        int n = 1;

        while (n <= 100) {
            if (n % 3 == 0) {
                System.err.println(n);
            }
            n++;
        }
    }
}
