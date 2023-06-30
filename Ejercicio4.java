Ejercicio 4:


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a category (a, b, or c): ");
        String category = scanner.nextLine();

        String word;

        if (category.equalsIgnoreCase("a")) {
            word = "hijo";
        } else if (category.equalsIgnoreCase("b")) {
            word = "padres";
        } else if (category.equalsIgnoreCase("c")) {
            word = "abuelos";
        } else {
            System.out.println("Invalid category entered!");
            scanner.close();
            return;
        }

        System.out.println("The corresponding word is: " + word);

        scanner.close();
    }
}
