public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }

            System.out.println("==" + (j + 1) + " time sort==");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
}
