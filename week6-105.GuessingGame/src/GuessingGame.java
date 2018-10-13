
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        int average;
        boolean greater;
        instructions(lowerLimit, upperLimit);
        while (true) {
            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + upperLimit + ".");
                break;
            }
            average = this.average(lowerLimit, upperLimit);   // get average of lower and upper
            greater = this.isGreaterThan(average);    // is searchedFor larger than average?

            if (greater) {
                lowerLimit = average + 1;
            } else {
                upperLimit = average;
            }
        }
    }

    public boolean isGreaterThan(int value) {
        String option;
        System.out.println("Is your number greater than "+value+"? (y/n)");
        option = this.reader.nextLine();
        return option.equals("y");
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
