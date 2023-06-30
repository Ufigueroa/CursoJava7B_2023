import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine();

        int dias;

        switch (mes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "february":
                dias = 28; // Assuming non-leap year
                break;
            default:
                System.out.println("Mes invalido");
                scanner.close();
                return;
        }

        System.out.println("El mes de " + mes + " tiene " + dias + " dias.");

        scanner.close();
    }
}
