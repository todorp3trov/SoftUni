import java.util.Scanner;

public class Basketball_Tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double matchesWon = 0f;
        double matchesLost = 0f;
        int matchesPlayed = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int numGames = Integer.parseInt(scanner.nextLine());
            matchesPlayed += numGames;

            for (int i = 1; i <= numGames; i++) {
                int homeTeamPoints = Integer.parseInt(scanner.nextLine());
                int oppositionPoints = Integer.parseInt(scanner.nextLine());

                if (homeTeamPoints > oppositionPoints) {
                    matchesWon++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n",
                            i, tournamentName, homeTeamPoints - oppositionPoints);
                } else {
                    matchesLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n",
                            i, tournamentName, oppositionPoints - homeTeamPoints);
                }
            }

            input = scanner.nextLine();
        }

        matchesWon = (matchesWon / matchesPlayed) * 100;
        matchesLost = (matchesLost / matchesPlayed) * 100;
        System.out.printf("%.2f%% matches win\n" +
                "%.2f%% matches lost", matchesWon, matchesLost);
    }
}
