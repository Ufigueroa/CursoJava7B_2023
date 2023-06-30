import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Generating 10 random numbers:");
        while (count < 10) {
            int number = random.nextInt(100);
            System.out.println(number);

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            count++;
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
