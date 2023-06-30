import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("Obtiene medalla de oro");
        } else if (puesto == 2) {
            System.out.println("Obtiene medalla de plata");
        } else if (puesto == 3) {
            System.out.println("Obtiene medalla de bronce");
        } else {
            System.out.println("Siga participando");
        }

        scanner.close();
    }
}
