
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int len = text.length();
        String ret = "";
        for(int ch = len-1; ch>=0 ; ch--)
            ret = ret + text.charAt(ch); 
        return ret;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
