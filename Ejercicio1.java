import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del primer examen: ");
        double score1 = scanner.nextDouble();

        System.out.println("Ingrese la nota del segundo examen: ");
        double score2 = scanner.nextDouble();

        System.out.println("Ingrese la nota del tercer examen: ");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("Average score: " + average);

        if (average >= 7.0) {
            System.out.println("Felicitaciones! el estudiante aprobó.");
        } else {
            System.out.println("Desafortunadamente, el estudiante desaprobó.");
        }

        scanner.close();
    }
}
