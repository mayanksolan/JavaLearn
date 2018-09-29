
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numGuess = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = reader.nextInt();
            numGuess++;
            if(guess<numberDrawn)
                System.out.println("The number is greater, guesses made: "+numGuess);
            else if (guess>numberDrawn)
                System.out.println("The number is lesser, guesses made: "+numGuess);
            else
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
