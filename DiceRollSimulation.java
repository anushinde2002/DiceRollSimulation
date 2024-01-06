import java.util.Random;
import java.util.Scanner;

public class DiceRollSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Roll Simulation!");

        // Ask the user to roll the dice
        System.out.print("Press Enter to roll the dice...");
        scanner.nextLine();

        // Simulate rolling two six-sided dice
        int die1 = random.nextInt(6) + 1; // Generate a random number between 1 and 6
        int die2 = random.nextInt(6) + 1;

        // Display the result
        System.out.println("\nDice 1: " + die1);
        System.out.println("Dice 2: " + die2);

        int total = die1 + die2;
        System.out.println("Total: " + total);

        // Close the scanner
        scanner.close();
    }
}
