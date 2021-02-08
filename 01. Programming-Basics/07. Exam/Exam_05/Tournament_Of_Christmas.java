import java.util.Scanner;

public class Tournament_Of_Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        String result;
        double moneyWonEachDay = 0;
        double totalMoneyWon = 0;

        int counterWins = 0;
        int counterLosses = 0;

        int counterDaysWon = 0;
        int counterDaysLost = 0;

        for (int i = 1; i <= tournamentDays; i++) {
            while(!sport.equals("Finish")) {

                result = scanner.nextLine();

                if (result.equals("win")) {
                    moneyWonEachDay += 20;
                    counterWins += 1;
                } else {
                    counterLosses += 1;
                }

                sport = scanner.nextLine();

            }

            if (counterWins > counterLosses) {
                moneyWonEachDay += 0.1 * moneyWonEachDay;
                counterDaysWon += 1;
            } else {
                counterDaysLost += 1;
            }

            totalMoneyWon += moneyWonEachDay;

            moneyWonEachDay = 0;
            counterLosses = 0;
            counterWins = 0;

            if (i == tournamentDays) {
                break;
            } else {
                sport = scanner.nextLine();
            }

        }

        if (counterDaysWon > counterDaysLost) {
            totalMoneyWon += 0.2 * totalMoneyWon;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyWon);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyWon);
        }
    }
}
