
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num1 = reader.nextInt();
        System.out.print("Type another number: ");
        int num2 = reader.nextInt();
        System.out.println("");
        System.out.println("Sum of the numbers: " + (num1+num2));
        // Implement your program here. Remember to ask the input from user
    }
}
