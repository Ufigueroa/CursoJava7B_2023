import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int sum = 0;

        System.out.println("Generating 10 random numbers:");
        while (count < 10) {
            int number = random.nextInt(100);
            System.out.println(number);
            sum += number;
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
