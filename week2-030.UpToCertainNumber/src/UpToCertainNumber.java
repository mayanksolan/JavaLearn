
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int num = 1;
        int upto = reader.nextInt();
        while(num<=upto)
        {
            System.out.println(num);
            num++;
        }
        
    }
}
