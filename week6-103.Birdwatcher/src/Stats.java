
import java.util.ArrayList;

public class Stats {

    private ArrayList<Bird> birds;

    public Stats() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird birds) {
        this.birds.add(birds);
    }

    public void addObservation(String name) {
        int count = 0;
        for (Bird b : birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                b.observed();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        for (Bird b : birds) {
            System.out.println(b.toString());
        }
    }

    public void show(String name) {
        for (Bird b : birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.println(b.toString());
            }
        }
    }
}
