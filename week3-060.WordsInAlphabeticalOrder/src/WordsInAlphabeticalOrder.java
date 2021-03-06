
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
        }
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for (String rand : words) {
            System.out.println(rand);
        }
    }
}
