import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int backHome = Integer.parseInt(scanner.nextLine());

        int weekendInSofia = 48 - backHome;
        double gamesInSofia = weekendInSofia * 0.75;
        double gamesDuringHolidays = holidays * (2f / 3);

        double totalGames = gamesInSofia + gamesDuringHolidays + backHome;
        if (yearType.equals("leap")) {
            totalGames = totalGames + (totalGames * 0.15);
        }
        System.out.println((int) Math.floor(totalGames));
    }
}
