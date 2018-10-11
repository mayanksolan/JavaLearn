
public class Bird {

    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getObserved() {
        return this.observed;
    }

    public String toString() {
        return this.getName() + " (" + this.getLatinName() + "): " + this.getObserved() + " observations";
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void observed() {
        this.observed++;
    }
}
