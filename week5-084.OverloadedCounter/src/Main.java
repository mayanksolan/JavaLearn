public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(12);
        System.out.println(count.value());
        Counter count2 = new Counter(true);
        System.out.println(count2.value());
        Counter count3 = new Counter();
        System.out.println(count3.value());
        Counter count4 = new Counter(1,true);
        count4.decrease();
        count4.decrease();
        System.out.println(count4.value());
        
    }
}
