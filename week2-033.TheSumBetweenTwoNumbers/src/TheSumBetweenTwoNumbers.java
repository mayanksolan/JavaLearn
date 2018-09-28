
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int num = reader.nextInt();
        int sum = 0;
        System.out.print("Last: ");
        int upto = reader.nextInt();
        while(num<=upto)
        {
            sum += num;
            num++;
        }
        System.out.println("Sum is "+sum);
    }
}
