
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        for(int ch = 0; ch<len ; ch++)
            System.out.println((ch+1)+". character: "+name.charAt(ch));        
    }
}
