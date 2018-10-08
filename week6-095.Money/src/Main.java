
public class Main {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);
        Money c = a.minus(b);
        
        System.out.println(c.cents());  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
