
public class Main {

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );
        LyyraCard cardOfJim = new LyyraCard(2);
        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
    }
}
