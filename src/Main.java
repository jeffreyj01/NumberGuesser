import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    The computer chooses a random number.
    The program informs the user of the range and any attempt limits.
    The user enters a guess.
    The program checks the guess against the random number:
    If correct, the game ends with a congratulatory message and the number of attempts taken.
    If too high, the program indicates "Too high, try again."
    If too low, the program indicates "Too low, try again."
    The loop continues until the correct number is guessed or attempts run out.
    If attempts run out, the game reveals the correct number.
     */
    public static void main(String[] args) {

        System.out.println("Welcome to NumberGuesser");
        System.out.println("A Random Number has been generated between 1 and 100. You have 5 attempts " +
                "to guess the number. ");

        int randomNumber = new Random().nextInt(100);
        int maxTry = 5;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < maxTry; i++)
        {
            System.out.println("Enter your guess...");
            int guess = input.nextInt();
            if(guess == randomNumber)
            {
                System.out.println("Congratulations! You chose the correct Random Number");
                break;
            }
            else if(guess > randomNumber)
            {
                System.out.println("Your number is higher than the Random Number");
            }
            else
            {
                System.out.println("Your number is less than the Random Number");
            }
        }

        System.out.println("You ran out of guesses. The correct number was " + randomNumber);
        input.close();
    }
}
