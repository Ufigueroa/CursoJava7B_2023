import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " es un numero par.");
        } else {
            System.out.println(number + " es un numero impar.");
        }

        scanner.close();
    }
}
