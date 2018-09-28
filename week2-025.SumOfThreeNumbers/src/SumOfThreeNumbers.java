
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        int cnt = 0;
        while (cnt < 3) {
            System.out.print("Enter the number: ");
            read = reader.nextInt();
            sum = sum + read;
            cnt++;
        }
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
