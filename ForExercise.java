public class ForExercise {
    public static void main(String args[]) {
        int count = 0;
        int sum = 0;

        // Loop all the numbers 1-100
        for (int i = 1; i <= 100; i++) {
            // Check if i is a multiple of 9
            if (i % 9 == 0) {
                // If yes, count the numbers of multiple of 9
                count++;
                // Get the sum of numbers of multiple of 9
                sum += i;
            }
        }

        System.out.println("Number of multiples of 9: " + count);
        System.out.println("Sum of multiples of 9: " + sum);
    }
}
