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
        System.out.println("A Random Number has been generated. You have 5 attempts " +
                "to guess the number. Each time you guess, you'll be told that the " +
                "number is higher or lower. Good Luck!");

        int randomNumber = new Random().nextInt(100);
        int maxTry = 0;

        Scanner input = new Scanner(System.in);

        while(maxTry < 5)
        {
        if(input.nextInt() > randomNumber)
        {
            System.out.println("Your number is higher than the Random Number");
            input.nextLine();
            maxTry++;
        }
        else if(input.nextInt() < randomNumber)
        {
            System.out.println("Your number is less than the Random Number");
            input.nextLine();
            maxTry++;
        }
        else {
            System.out.println("You chose the correct Random Number");
        }
        }

        System.out.println("You ran out of guesses. The correct number was " + randomNumber);
    }
}
