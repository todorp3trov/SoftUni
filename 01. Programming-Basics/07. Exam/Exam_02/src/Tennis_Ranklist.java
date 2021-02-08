import java.util.Scanner;

public class Tennis_Ranklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double averagePoints = 0f;
        double percentWon = 0f;

        for (int i = 0; i < numTournaments; i++) {
            String result = scanner.nextLine();
            int pointsWon = 0;

            if (result.equals("W")) {
                pointsWon = 2000;
                percentWon++;
            } else if (result.equals("F")) {
                pointsWon = 1200;
            } else if (result.equals("SF")) {
                pointsWon = 720;
            }

            startingPoints += pointsWon;
            averagePoints += pointsWon;
        }

        averagePoints /= numTournaments;
        percentWon = (percentWon / numTournaments) * 100;

        System.out.printf("Final points: %d\n" +
                "Average points: %d\n" +
                "%.2f%%", startingPoints, (int) Math.floor(averagePoints), percentWon);
    }
}
