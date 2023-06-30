import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero (1-3): ");
        int position = scanner.nextInt();

        switch (position) {
            case 1:
                System.out.println("Obtiene medalla de oro");
                break;
            case 2:
                System.out.println("Obtiene medalla de plata");
                break;
            case 3:
                System.out.println("Obtiene medalla de bronce");
                break;
            default:
                System.out.println("Siga participando");
                break;
        }

        scanner.close();
    }
}
