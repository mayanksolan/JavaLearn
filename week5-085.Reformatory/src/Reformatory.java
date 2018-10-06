
public class Reformatory {

    private int totweigmes = 0;

    public int weight(Person person) {
        this.totweigmes++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }

    public int totalWeightsMeasured() {
        return this.totweigmes;
    }
}
