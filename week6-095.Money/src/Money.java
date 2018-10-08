
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euroSum = this.euros + added.euros();
        int centSum = this.cents + added.cents();
        Money newM = new Money(euroSum, centSum);
        return newM;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        int nEuro = this.euros - decremented.euros();
        int nCent;
        if (nEuro < 0) {
            nEuro = 0;
            nCent = 0;
            return new Money(nEuro, nCent);
        } else {
            nCent = this.cents - decremented.cents();
            if (nCent < 0) {
                nEuro--;
                nCent = 100 + nCent;
            }
            return new Money(nEuro, nCent);
        }
    }
}
