import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();

        System.out.println("Tablas de multiplicar:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Table for " + i + ":");

            int evenSum = 0;

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);

                evenSum += result * (result % 2);
            }

            System.out.println("Suma de los numeros pares: " + evenSum);
            System.out.println();
        }

        scanner.close();
    }
}
