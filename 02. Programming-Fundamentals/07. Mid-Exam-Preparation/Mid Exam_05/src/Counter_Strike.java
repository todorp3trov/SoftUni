import java.util.Scanner;

public class Counter_Strike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int battlesWon = 0;

        boolean gameEnd = false;
        while (true) {
            if (input.equals("End of battle")) {
                gameEnd = true;
                break;
            }
            int distance = Integer.parseInt(input);


            if (energy - distance < 0) {
                break;
            }
            energy -= distance;
            battlesWon++;

            if (battlesWon % 3 == 0) {
                energy += battlesWon;
            }

            input = scanner.nextLine();
        }

        if (gameEnd) {
            System.out.printf("Won battles: %d. Energy left: %d\n", battlesWon, energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy\n", battlesWon, energy);
        }
    }
}
