public class MulForExercise02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %-4d", j, i, i * j);
            }
            System.out.println();
        }
    }
}
