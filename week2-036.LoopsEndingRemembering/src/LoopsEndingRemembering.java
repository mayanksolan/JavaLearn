
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type Numbers: ");
        int num, sum = 0, count = 0, even = 0, odd = 0;
        double avg = 0.0;
        while (true) {
            num = reader.nextInt();
            if (num == -1) {
                break;
            } else {
                sum += num;
                count++;
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        if (num == -1 && sum <= 0) {
            System.out.println("Thank you and see you later!");
        } else {
            avg = (double) sum / count;
            System.out.println("");
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is " + sum);
            System.out.println("How many numbers: " + count);
            System.out.println("Average: " + avg);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        }
    }
}
