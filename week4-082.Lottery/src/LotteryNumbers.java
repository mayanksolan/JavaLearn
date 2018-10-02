
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private Random random = new Random();

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        numbers.clear();
        int i = 0;
        while (i < 7) {
            int num = random.nextInt(39) + 1;
            if (!containsNumber(num)) {
                this.numbers.add(num);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
