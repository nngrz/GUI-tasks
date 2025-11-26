import java.util.Scanner;

public class ArrayExpand {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        Scanner myObj = new Scanner(System.in);

        do {
            // First copy the old elements to the new array
            int[] arrNew = new int[arr.length + 1];

            for (int i = 0; i < arrNew.length - 1; i++) {
                arrNew[i] = arr[i];
            }

            // Ask user if add new element
            System.out.println("If continue add y/n");
            char key = myObj.next().charAt(0);
            if (key == 'n') {
                break;
            }

            // If user want to add new element
            System.out.println("Add a number: ");
            int newNumber = myObj.nextInt();
            arrNew[arrNew.length - 1] = newNumber;
            arr = arrNew;

            // Output the new array
            System.out.println("Array after expanded: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
        } while (true);
    }
}
