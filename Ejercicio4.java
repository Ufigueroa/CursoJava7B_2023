Ejercicio 4:


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una categoria (a, b, or c): ");
        String category = scanner.nextLine();

        String word;

        if (category.equalsIgnoreCase("a")) {
            word = "hijo";
        } else if (category.equalsIgnoreCase("b")) {
            word = "padres";
        } else if (category.equalsIgnoreCase("c")) {
            word = "abuelos";
        } else {
            System.out.println("Categoria invalida ingresada!");
            scanner.close();
            return;
        }

        System.out.println("La palabra correspondiente es: " + word);

        scanner.close();
    }
}
