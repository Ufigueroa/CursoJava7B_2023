import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int number = scanner.nextInt();

        if ((number >= 1 && number <= 12) || (number >= 13 && number <= 24) || (number >= 25 && number <= 36)) {
            if (number >= 1 && number <= 12) {
                System.out.println("Primera docena");
            } else if (number >= 13 && number <= 24) {
                System.out.println("Segunda docena");
            } else {
                System.out.println("Tercera docena");
            }
        } else {
            System.out.println("El número " + number + " está fuera de rango");
        }

        scanner.close();
    }
}
