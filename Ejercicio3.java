import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mes: ");
        String month = scanner.nextLine();

        int days = 0;

        if (month.equalsIgnoreCase("Enero") || month.equalsIgnoreCase("Marzo") ||
            month.equalsIgnoreCase("Mayo") || month.equalsIgnoreCase("Julio") ||
            month.equalsIgnoreCase("Agosto") || month.equalsIgnoreCase("Octubre") ||
            month.equalsIgnoreCase("Diciembre")) {
            days = 31;
        } else if (month.equalsIgnoreCase("Abril") || month.equalsIgnoreCase("Junio") ||
                   month.equalsIgnoreCase("Septiembre") || month.equalsIgnoreCase("Noviembre")) {
            days = 30;
        } else if (month.equalsIgnoreCase("Febrero")) {
            days = 28; // Assuming non-leap year
        } else {
            System.out.println("Mes invalido");
            System.exit(0);
        }

        System.out.println("El mes de " + month + " tiene " + days + " dias.");

        scanner.close();
    }
}
