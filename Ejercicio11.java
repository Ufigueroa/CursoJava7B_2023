import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        char letter = scanner.nextLine().charAt(0);

        boolean isVowel = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                           letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');

        if (isVowel) {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra no es una vocal.");
        }

        scanner.close();
    }
}
