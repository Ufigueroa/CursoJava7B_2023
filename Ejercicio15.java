import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra (a, b, or c): ");
        char option = scanner.next().charAt(0);

        switch (option) {
            case 'a':
                System.out.println("Auto con 4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("Auto con motor, cierre centralizado y aire");
                break;
            case 'c':
                System.out.println("4 ruedas, un motor, cierre centralizado, aire, airbag");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

        scanner.close();
    }
}
