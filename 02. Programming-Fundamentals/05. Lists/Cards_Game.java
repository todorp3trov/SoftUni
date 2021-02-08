import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.get(0));
                playerOne.add(playerTwo.get(0));
                playerOne.remove(0);

                playerTwo.remove(0);
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                playerTwo.add(playerTwo.get(0));
                playerTwo.add(playerOne.get(0));
                playerTwo.remove(0);

                playerOne.remove(0);
            } else {
                playerOne.remove(0);
                playerTwo.remove(0);
            }
        }

        int sum = 0;
        if (playerOne.isEmpty()) {
            for (Integer i : playerTwo) {
                sum += i;
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            for (Integer i : playerOne) {
                sum += i;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
    }
}
