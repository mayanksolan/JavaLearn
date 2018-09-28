
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 1;
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
