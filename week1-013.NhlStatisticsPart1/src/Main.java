
import nhlstats.NHLStatistics;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten players by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 players by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Stats of Sydney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Stats of Philadelphia Flyers players");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("Stats of Anaheim Ducks players");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
                
    }
}
