import java.util.Scanner;

public class Lady_Bugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        String input = scanner.nextLine();
        String[] splitter = input.split(" ");
        for (String s : splitter) {
            int ladyBugPos = Integer.parseInt(s);
            if (ladyBugPos >= 0 && ladyBugPos <= field.length - 1) {
                field[ladyBugPos] = 1;
            }
        }

        input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            int ladyBugPos = Integer.parseInt(command[0]);
            String direction = command[1];
            int flyLength = Integer.parseInt(command[2]);

            if (ladyBugPos < 0 || ladyBugPos >= fieldSize || field[ladyBugPos] != 1) {
                input = scanner.nextLine();
                continue;
            }

            field[ladyBugPos] = 0;

            if (direction.equals("right")) {
                ladyBugPos += flyLength;

                while (ladyBugPos >= 0 && ladyBugPos < fieldSize && field[ladyBugPos] == 1) {
                    ladyBugPos += flyLength;
                }

                if (ladyBugPos >= 0 && ladyBugPos < fieldSize) {
                    field[ladyBugPos] = 1;
                }
            } else {
                ladyBugPos -= flyLength;

                while (ladyBugPos >= 0 && ladyBugPos < fieldSize && field[ladyBugPos] == 1) {
                    ladyBugPos -= flyLength;
                }

                if (ladyBugPos >= 0 && ladyBugPos < fieldSize) {
                    field[ladyBugPos] = 1;
                }
            }
            input = scanner.nextLine();
        }

        for (int j : field) {
            System.out.print(j + " ");
        }
    }
}
