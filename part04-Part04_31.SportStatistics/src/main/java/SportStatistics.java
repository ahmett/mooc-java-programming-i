
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try {
            int wins = 0, losses = 0;
            
            scan = new Scanner(Paths.get(file));

            while (scan.hasNextLine()) {
                String[] match = scan.nextLine().split(",");
                
                String homeTeam = match[0];
                String visitingTeam = match[1];
                int homeTeamPoints = Integer.valueOf(match[2]);
                int visitingTeamPoints = Integer.valueOf(match[3]);
                
                if (!homeTeam.equals(team) && !visitingTeam.equals(team)) {
                    continue;
                }
                
                if ((homeTeam.equals(team) && homeTeamPoints > visitingTeamPoints) || (visitingTeam.equals(team) && visitingTeamPoints > homeTeamPoints)) {
                    wins++;
                } else {
                    losses++;
                }
            }
            
            System.out.println("Games: " + (wins + losses));
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
