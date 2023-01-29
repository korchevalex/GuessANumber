import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomCeiling = 100;
        int level = 1;
        boolean endGame = false;

        while (!endGame) {
            System.out.println("Level " + level);
            int computerNumber = random.nextInt(1, randomCeiling);
            while (true) {

                System.out.println("Guess a number 1-" + randomCeiling);
                String playerInput = scanner.nextLine();

                boolean isValid = true;

                for (int i = 0; i < playerInput.length(); i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    int playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("You guessed the number!");

                        System.out.println("Continue to the next level?[y/n]");
                        String playerChoice = scanner.nextLine().toLowerCase();
                        if (playerChoice.equals("y")) {
                            level++;
                            randomCeiling *= 2;
                        } else {
                            System.out.println("Good game!");
                            endGame = true;
                        }
                        break;
                    } else if (playerNumber > computerNumber) {
                        System.out.println("Lower!");
                    } else {
                        System.out.println("Higher!");
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }
    }
}