
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner birdie = new Scanner(System.in);
        Stats stat = new Stats();
        while (true) {
            System.out.print("? ");
            String input = birdie.nextLine();
            if (input.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = birdie.nextLine();
                System.out.print("Latin Name: ");
                String latinName = birdie.nextLine();
                stat.addBird(new Bird(name, latinName));
            }
            if (input.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = birdie.nextLine();
                stat.addObservation(name);
            }
            if (input.equalsIgnoreCase("Statistics")) {
                stat.statistics();
            }
            if (input.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = birdie.nextLine();
                stat.show(name);
            }
            if (input.equalsIgnoreCase("Quit")) {
                break;
            }
        }
    }
}
