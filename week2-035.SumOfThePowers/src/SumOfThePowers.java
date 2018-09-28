
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.print("Type a number: ");
        int upto = reader.nextInt();
        while(num<=upto)
        {
            sum += (int)Math.pow(2, num);
            num++;
        }
        System.out.println("Factorial is "+sum);
    }
}
