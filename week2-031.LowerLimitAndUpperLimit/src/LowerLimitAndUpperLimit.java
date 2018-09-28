
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int num = reader.nextInt();
        System.out.print("Last: ");
        int upto = reader.nextInt();
        while(num<=upto)
        {
            System.out.println(num);
            num++;
        }

    }
}
