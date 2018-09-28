
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int num1 = reader.nextInt();
        System.out.println("");
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int num2 = reader.nextInt();
        System.out.println("");
        System.out.println(name1+" and "+name2+" are "+(num1+num2)+" years old in total.");
    }
}
