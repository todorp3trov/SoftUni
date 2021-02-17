import java.util.ArrayDeque;
import java.util.Scanner;

public class Radioactive_Mutant_Vampire_Bunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();


        char[][] lair = new char[rows][cols];
        int[] playerPosition = {0, 0};
        ArrayDeque<int[]> bunnieIndexes = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            String data = scanner.nextLine();
            for (int col = 0; col < cols; col++) {
                char currentChar = data.charAt(col);
                if (currentChar == 'P') {
                    playerPosition = new int[]{row, col};
                } else if (currentChar == 'B') {
                    bunnieIndexes.offer(new int[]{row, col});
                }
                lair[row][col] = data.charAt(col);
            }
        }

        String[] moves = scanner.nextLine().split("");

        int count = 0;
        while (count != moves.length) {
            byte result = playerMakeMove(lair, moves[count++].charAt(0), playerPosition);
            if (result == -2) {
                printLair(lair);
                System.out.printf("dead: %d %d\n", playerPosition[0], playerPosition[1]);
                return;
            }
            bunniesSpread(lair, bunnieIndexes);

            if (result == 0) {
                printLair(lair);
                System.out.printf("won: %d %d\n", playerPosition[0], playerPosition[1]);
                return;
            } else if (result == -1) {
                printLair(lair);
                System.out.printf("dead: %d %d\n", playerPosition[0], playerPosition[1]);
                return;
            }
        }
    }

    private static byte playerMakeMove(char[][] lair, char move, int[] playerPosition) {
        int x = playerPosition[0];
        int y = playerPosition[1];

        if (lair[x][y] == 'B') {
            return -2;
        }

        int[] oldPlayerPos = new int[]{x, y};
        switch (move) {
            case 'R':
                y++;
                break;
            case 'L':
                y--;
                break;
            case 'U':
                x--;
                break;
            case 'D':
                x++;
                break;
        }

        lair[oldPlayerPos[0]][oldPlayerPos[1]] = '.';
        if (isInBounds(lair, x, y)) {
            playerPosition[0] = x;
            playerPosition[1] = y;
            if (lair[x][y] == '.') {
                lair[x][y] = 'P';
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    private static void bunniesSpread(char[][] lair, ArrayDeque<int[]> bunnieIndexes) {
        ArrayDeque<int[]> newBunnieIndexes = new ArrayDeque<>();
        while (!bunnieIndexes.isEmpty()) {
            int[] indexes = bunnieIndexes.poll();
            int x = indexes[0];
            int y = indexes[1];

            if (isInBounds(lair, x + 1, y) && lair[x + 1][y] != 'B') {
                lair[x + 1][y] = 'B';
                newBunnieIndexes.offer(new int[] {x + 1, y});
            }
            if (isInBounds(lair, x - 1, y) && lair[x - 1][y] != 'B') {
                lair[x - 1][y] = 'B';
                newBunnieIndexes.offer(new int[] {x - 1, y});
            }
            if (isInBounds(lair, x, y + 1) && lair[x][y + 1] != 'B') {
                lair[x][y + 1] = 'B';
                newBunnieIndexes.offer(new int[] {x, y + 1});
            }
            if (isInBounds(lair, x, y - 1) && lair[x][y - 1] != 'B') {
                lair[x][y - 1] = 'B';
                newBunnieIndexes.offer(new int[] {x, y - 1});
            }
        }

        while (!newBunnieIndexes.isEmpty()) {
            bunnieIndexes.offer(newBunnieIndexes.pop());
        }
    }

    private static boolean isInBounds(char[][] lair, int x, int y) {
        return ((x >= 0 && x < lair.length) && (y >= 0 && y < lair[x].length));
    }

    private static void printLair(char[][] lair) {
        for (int row = 0; row < lair.length; row++) {
            for (int col = 0; col < lair[row].length; col++) {
                System.out.print(lair[row][col]);
            }
            System.out.println();
        }
    }
}
