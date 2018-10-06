
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> playerList;
    private int maxSize;

    public Team(String teamName) {
        this.teamName = teamName;
        this.playerList = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (playerList.size() < this.maxSize) {
            playerList.add(player);
        }
    }

    public void printPlayers() {
        for (Player newPlayer : playerList) {
            System.out.println(newPlayer.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return playerList.size();
    }
    
    public int goals()
    {
        int goals = 0;
        for(Player player : playerList)
        {
            goals += player.goals();
        }
        return goals;
    }
}
