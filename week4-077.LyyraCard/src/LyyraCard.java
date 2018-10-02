
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        String text = "The card has " + this.balance + " euros";
        return text;
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        double check = this.balance + amount;
        if(check>150)
            balance = 150;
        else if(amount<0)
            balance = balance;
        else
            balance = check;
    }

}
