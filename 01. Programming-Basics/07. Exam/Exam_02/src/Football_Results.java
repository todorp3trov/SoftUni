import java.util.Scanner;

public class Football_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String game1 = scanner.nextLine();
        String game2 = scanner.nextLine();
        String game3 = scanner.nextLine();

        int gamesWon = 0;
        int gamesLost = 0;
        int gamesDrawn = 0;

        int result1 = Integer.parseInt(String.valueOf(game1.charAt(0)))
                - Integer.parseInt(String.valueOf(game1.charAt(2)));
        int result2 = Integer.parseInt(String.valueOf(game2.charAt(0)))
                - Integer.parseInt(String.valueOf(game2.charAt(2)));
        int result3 = Integer.parseInt(String.valueOf(game3.charAt(0)))
                - Integer.parseInt(String.valueOf(game3.charAt(2)));

        if (result1 == 0) {
            gamesDrawn++;
        } else if (result1 > 0) {
            gamesWon++;
        } else {
            gamesLost++;
        }

        if (result2 == 0) {
            gamesDrawn++;
        } else if (result2 > 0) {
            gamesWon++;
        } else {
            gamesLost++;
        }

        if (result3 == 0) {
            gamesDrawn++;
        } else if (result3 > 0) {
            gamesWon++;
        } else {
            gamesLost++;
        }

        System.out.printf("Team won %d games.\n" +
                "Team lost %d games.\n" +
                "Drawn games: %d", gamesWon, gamesLost, gamesDrawn);

    }
}
