
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        if (this.squareMeters * this.pricePerSquareMeter >= otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
            return (this.squareMeters * this.pricePerSquareMeter) - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        } else {
            return (otherApartment.squareMeters * otherApartment.pricePerSquareMeter) - (this.squareMeters * this.pricePerSquareMeter);
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.squareMeters * this.pricePerSquareMeter >= otherApartment.squareMeters * otherApartment.pricePerSquareMeter)
            return true;
        else
            return false;
    }
}
