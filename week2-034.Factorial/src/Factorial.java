import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 1;
        int fact = 1;
        System.out.print("Type a number: ");
        int upto = reader.nextInt();
        while(num<=upto)
        {
            fact *= num;
            num++;
        }
        System.out.println("Factorial is "+fact);
    }
}
