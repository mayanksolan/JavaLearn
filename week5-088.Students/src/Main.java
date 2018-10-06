
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Student stud;
        ArrayList<Student> list = new ArrayList<Student>();
        Boolean check = true;
        while (check) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        for (Student newKid : list) {
            System.out.println(newKid.toString());
        }
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student kwid : list) {
            if (kwid.getName().contains(search)) {
                System.out.println(kwid.toString());
            }
        }
    }
}
