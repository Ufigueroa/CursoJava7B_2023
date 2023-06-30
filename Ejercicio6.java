import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int Curso = scanner.nextInt();

        if (Curso == 0) {
            System.out.println("Jardín de infantes");
        } else if (Curso >= 1 && Curso <= 6) {
            System.out.println("Primaria");
        } else if (Curso >= 7 && Curso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("Invalido!");
        }

        scanner.close();
    }
}
