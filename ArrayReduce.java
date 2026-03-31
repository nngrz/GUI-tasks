import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Scanner myObj = new Scanner(System.in);

        while (true) {

            // If there is just one element left, print the warning
            if (arr.length == 1) {
                System.out.println("There is just one element in the array, can not reduce anymore.");
                break;
            }

            System.out.println("If continue reduce y/n");
            char key = myObj.next().charAt(0);

            if (key == 'n') {
                break;
            }

            int[] arrNew = new int[arr.length - 1];

            // First copy the old array to a new arr
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }

            arr = arrNew;

            // Print the reduced array array
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("Program ends.");
        myObj.close();
    }
}
