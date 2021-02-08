import java.util.Scanner;

public class Game_Number_Wars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        int playerOneScore = 0;
        int playerTwoScore = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of game")) {
            int playerOneCard = Integer.parseInt(input);
            int playerTwoCard = Integer.parseInt(scanner.nextLine());

            if (playerOneCard > playerTwoCard) {
                playerOneScore += playerOneCard - playerTwoCard;
            } else if (playerOneCard < playerTwoCard) {
                playerTwoScore += playerTwoCard - playerOneCard;
            } else {
                playerOneCard = Integer.parseInt(scanner.nextLine());
                playerTwoCard = Integer.parseInt(scanner.nextLine());

                if (playerOneCard > playerTwoCard) {
                    System.out.printf("Number wars!\n%s is winner with %d points", playerOne, playerOneScore);
                } else {
                    System.out.printf("Number wars!\n%s is winner with %d points", playerTwo, playerTwoScore);
                }
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s has %d points\n" +
                "%s has %d points", playerOne, playerOneScore, playerTwo, playerTwoScore);
    }
}
