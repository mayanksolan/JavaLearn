
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> person = new ArrayList<Person>();

    public void add(String name, String number) {
        person.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : person) {
            System.out.println(p.toString());
        }
    }

    public String searchNumber(String name) {
        int num=0;
        for(Person p : person)
        {
            if(p.getName().equals(name)) {
                num++;
                return p.getNumber();
            }
        }
        if(num==0)
            return "number not known";
        else
            return null;
    }
}
