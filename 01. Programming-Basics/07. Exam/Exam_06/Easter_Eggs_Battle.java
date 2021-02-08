import java.util.Scanner;

public class Easter_Eggs_Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEggCount = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggCount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("End of battle")) {

            if (command.equals("one")) {
                secondPlayerEggCount--;
                if (secondPlayerEggCount == 0) {
                    System.out.printf("Player two is out of eggs. " +
                            "Player one has %d eggs left.\n", firstPlayerEggCount);
                    break;
                }
            } else if (command.equals("two")) {
                firstPlayerEggCount--;
                if (firstPlayerEggCount == 0) {
                    System.out.printf("Player one is out of eggs. " +
                            "Player two has %d eggs left.\n", secondPlayerEggCount);
                    break;
                }
            }

            command = scanner.nextLine();
        }

        if (command.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.\n" +
                    "Player two has %d eggs left.\n", firstPlayerEggCount, secondPlayerEggCount);
        }
    }
}
