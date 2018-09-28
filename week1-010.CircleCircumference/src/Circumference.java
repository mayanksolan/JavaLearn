
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        double cir = 2*Math.PI*(double)radius;
        System.out.println("");
        System.out.println("Circumference of the circle: "+ cir);
        // Program your solution here 
    }
}
