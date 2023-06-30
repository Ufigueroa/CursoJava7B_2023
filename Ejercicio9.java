import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the choice for User 1 (0 for 'Rock', 1 for 'Paper', 2 for 'Scissors'): ");
        int user1 = scanner.nextInt();

        System.out.println("Enter the choice for User 2 (0 for 'Rock', 1 for 'Paper', 2 for 'Scissors'): ");
        int user2 = scanner.nextInt();

        String choice1 = getChoice(user1);
        String choice2 = getChoice(user2);

        System.out.println("User 1 chose: " + choice1);
        System.out.println("User 2 chose: " + choice2);

        String winner = determineWinner(choice1, choice2);
        System.out.println("The winner is: " + winner);

        scanner.close();
    }

    public static String getChoice(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

    public static String determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "It's a tie!";
        } else if ((choice1.equals("Rock") && choice2.equals("Scissors")) ||
                   (choice1.equals("Paper") && choice2.equals("Rock")) ||
                   (choice1.equals("Scissors") && choice2.equals("Paper"))) {
            return "User 1";
        } else if ((choice2.equals("Rock") && choice1.equals("Scissors")) ||
                   (choice2.equals("Paper") && choice1.equals("Rock")) ||
                   (choice2.equals("Scissors") && choice1.equals("Paper"))) {
            return "User 2";
        } else {
            return "Invalid choice";
        }
    }
}
