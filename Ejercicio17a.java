import java.util.Scanner;

public class Ejercicio17a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();

        System.out.println("Tabla de multiplicar para " + number + ":");

        int evenSum = 0;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

            if (result % 2 == 0) {
                evenSum += result;
            }
        }

        System.out.println("Suma de los numeros pares: " + evenSum);

        scanner.close();
    }
}
