import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int startingPoints = 301;

        int unsuccessfulAttempts = 0;
        int successfulAttempts = 0;

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String sector = input;
            int points = Integer.parseInt(scanner.nextLine());

            if (sector.equals("Triple")) {
                points *= 3;
            } else if (sector.equals("Double")) {
                points *= 2;
            }

            if (points <= startingPoints) {
                startingPoints -= points;
                successfulAttempts++;
            } else {
                unsuccessfulAttempts++;
            }

            if (startingPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", player, successfulAttempts);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s retired after %d unsuccessful shots.", player, unsuccessfulAttempts);
    }
}
