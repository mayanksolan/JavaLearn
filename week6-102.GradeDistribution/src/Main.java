
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grade grade = new Grade();
        int i = 0;
        System.out.println("Type exam scores, -1 completes:");
        while (i != -1) {
            i = lukija.nextInt();
            if(i>=0 && i<=60)
                grade.addScore(new Scores(i));
        }
        grade.graddist();
        grade.printGrades();
        System.out.println("Acceptance percentage: "+grade.accPer());
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
