
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.toUpperCase().contains(searched.toUpperCase().trim())) {
            return true;
        } else {
            return false;
        }
    }
}
