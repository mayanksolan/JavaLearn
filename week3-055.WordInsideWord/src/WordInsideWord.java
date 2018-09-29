
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String name1 = reader.nextLine();
        System.out.print("Type the second word: ");
        String name2 = reader.nextLine();
        if(name1.indexOf(name2) != -1)
            System.out.println("The word '"+name2+"' is found in the word '"+name1+"'.");
        else
            System.out.println("The word '"+name2+"' is not found in the word '"+name1+"'.");
    }
}
