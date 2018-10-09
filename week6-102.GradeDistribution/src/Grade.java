
import java.util.ArrayList;

public class Grade {

    private ArrayList<Scores> score;
    private int[] gradDist = {0, 0, 0, 0, 0, 0};

    public Grade() {
        this.score = new ArrayList<Scores>();
    }

    public void addScore(Scores score) {
        this.score.add(score);
    }

    public void printScores() {
        for (Scores s : this.score) {
            System.out.println(s.toString());
        }
    }

    public void graddist() {
        for (Scores s : this.score) {
            if (s.getScores() >= 0 && s.getScores() <= 29) {
                this.gradDist[0] += 1;
            } else if (s.getScores() >= 30 && s.getScores() <= 34) {
                this.gradDist[1] += 1;
            } else if (s.getScores() >= 35 && s.getScores() <= 39) {
                this.gradDist[2] += 1;
            } else if (s.getScores() >= 40 && s.getScores() <= 44) {
                this.gradDist[3] += 1;
            } else if (s.getScores() >= 45 && s.getScores() <= 49) {
                this.gradDist[4] += 1;
            } else if (s.getScores() >= 50 && s.getScores() <= 60) {
                this.gradDist[5] += 1;
            }
        }
    }

    public double accPer() {
        double count = 0;
        double tot = 0;
        for (Scores s : this.score) {
            tot++;
            if (s.getScores() >= 30) {
                count++;
            }
        }
        if(tot>0)
            return  100 * (count / tot);
        else 
            return 0;
    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        for (int i = this.gradDist.length; i > 0; i--) {
            System.out.print(i - 1 + ":");
            for (int j = this.gradDist[i - 1]; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
