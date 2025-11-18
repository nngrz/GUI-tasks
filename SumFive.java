public class SumFive {
    public static void main(String args[]) {

        int targetSum = 5;
        int startI = 0;

        for (int i = startI; i <= targetSum; i++) {
            int j = targetSum - i;
            System.out.println(i + " + " + j + " = " + targetSum);
        }
    }
}
