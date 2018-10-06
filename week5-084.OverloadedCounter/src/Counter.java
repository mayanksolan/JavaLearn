
public class Counter {

    private int num;
    private boolean che;

    public Counter(int startingValue, boolean check) {
        this.num = startingValue;
        this.che = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return num;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.num += increaseAmount;
        }
    }

    public void decrease() {
        if (this.che) {
            if (this.num != 0) {
                this.decrease(1);
            }
        } else {
            this.decrease(1);
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.che == true) {
                if (this.num - decreaseAmount >= 0) {
                    this.num -= decreaseAmount;
                } else {
                    this.num = 0;
                }
            } else {
                this.num -= decreaseAmount;
            }
        }
    }
}
