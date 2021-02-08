import java.util.Scanner;

public class Easter_Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxScore = Integer.MIN_VALUE;
        int currentScore = 0;

        for (int i = 0; i < easterBreadCount; i++) {
            String command = scanner.nextLine();
            String name = command;
            while (!command.equals("Stop")) {
                command = scanner.nextLine();
                try {
                    currentScore += Integer.parseInt(command);
                } catch (Exception e) {
                    break;
                }
            }

            System.out.println(name + " has " + currentScore + " points.");
            if (currentScore > maxScore) {
                maxScore = currentScore;
                winner = name;
                System.out.println(name + " is the new number 1!");
            }

            currentScore = 0;
        }
        System.out.printf("%s won competition with %d points!\n", winner, maxScore);
    }
}
