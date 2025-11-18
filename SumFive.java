public class SumFive {
    public static void main(String args[]) {

        int targetSum = 5;
        int startI = 0;
        int startJ = 5;

        for (int i = startI, j = startJ; i <= targetSum; i++, j--) {
            System.out.println(i + " + " + j + " = " + targetSum);
        }
    }
}
