
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1, 20, 1000);
        Apartment twoRoomsBrooklyn = new Apartment(2, 30, 2000);
        Apartment fourAndKitchenBronx = new Apartment(2, 23, 1500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));

    }
}
