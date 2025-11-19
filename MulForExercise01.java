import java.util.Scanner;

public class MulForExercise01 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int classNumber = 3;
        int studentNumberEachClass = 5;

        int sumAllClasses = 0;

        int scorePass = 60;
        int countPass = 0;
        // Loop through classes
        for (int i = 1; i <= classNumber; i++) {
            int sumEachClass = 0; // Reset sum of each class to 0

            System.out.println("Class " + i);
            for (int j = 1; j <= studentNumberEachClass; j++) {
                System.out.println("Enter score for student " + j);

                int scoreEachStudent = myObj.nextInt();

                if (scoreEachStudent >= scorePass) {
                    countPass++;
                }
                sumEachClass += scoreEachStudent;
            }

            int avgEachClass = sumEachClass / studentNumberEachClass;
            System.out.println("Average score for class " + i + " is " + avgEachClass);

            sumAllClasses += sumEachClass;
        }

        int avgAllClasses = sumAllClasses / (classNumber*studentNumberEachClass);
        System.out.println("Average score for all class is " + avgAllClasses);
        System.out.println("There are " + countPass + " students passed");

        myObj.close();
    }
}
