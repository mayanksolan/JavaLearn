import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        for(int ch = len-1; ch>=0 ; ch--)
            System.out.print(name.charAt(ch));    
    }
}
