
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int len = text.length();
        String ret = "";
        for (int ch = len - 1; ch >= 0; ch--) {
            ret = ret + text.charAt(ch);
        }
        if (ret.equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
