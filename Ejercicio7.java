import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int number1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int number2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int number3 = scanner.nextInt();

        int largestNumber = number1;

        if (number2 > largestNumber) {
            largestNumber = number2;
        }

        if (number3 > largestNumber) {
            largestNumber = number3;
        }

        System.out.println("El numero mas grande es: " + largestNumber);

        scanner.close();
    }
}
