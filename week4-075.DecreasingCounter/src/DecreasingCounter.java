
public class DecreasingCounter {

    private int value;
    private int remValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        remValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value != 0) {
            value--;
        }
    }

    public void reset() {
        value = 0;
    }

    // and here the rest of the methods
    public void setInitial() {
        value = remValue;
    }
}
