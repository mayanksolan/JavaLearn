
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void setValue(int value) {
        if(value>=0 && value<=this.upperLimit)
            this.value = value;
    }

    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            value++;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }
}
