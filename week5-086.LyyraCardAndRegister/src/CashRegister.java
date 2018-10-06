
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            this.cashInRegister += 2.5;
            this.economicalSold++;
            return cashGiven - 2.5;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.0) {
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            return cashGiven - 4.0;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        boolean ans = false;
        if (card.balance() >= 2.5) {
            this.economicalSold++;
            //this.cashInRegister += 2.5;
            ans = card.pay(2.5);
            return ans;
        } else {
            return ans;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        boolean ans = false;
        if (card.balance() >= 4.0) {
            this.gourmetSold++;
            //this.cashInRegister += 4.0;
            ans = card.pay(4.0);
            return ans;
        } else {
            return ans;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
