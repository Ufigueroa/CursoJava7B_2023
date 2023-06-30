import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first exam score: ");
        double score1 = scanner.nextDouble();

        System.out.println("Enter the second exam score: ");
        double score2 = scanner.nextDouble();

        System.out.println("Enter the third exam score: ");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("Average score: " + average);

        if (average >= 7.0) {
            System.out.println("Congratulations! The student passed.");
        } else {
            System.out.println("Unfortunately, the student failed.");
        }

        scanner.close();
    }
}
