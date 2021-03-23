import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bee {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int fieldSize = Integer.parseInt(reader.readLine());

        char[][] field = new char[fieldSize][fieldSize];

        int[] beePos = new int[2];
        int[] bonusPos = new int[2];

        int[] pollinatedFlowers = new int[1];

        for (int i = 0; i < fieldSize; i++) {
            char[] row = reader.readLine().toCharArray();
            for (int j = 0; j < fieldSize; j++) {
                if (row[j] == 'B') {
                    beePos[0] = i;
                    beePos[1] = j;
                } else if (row[j] == 'O') {
                    bonusPos[0] = i;
                    bonusPos[1] = j;
                }
                field[i][j] = row[j];
            }
        }

        while (true) {
            String direction = reader.readLine();

            if (direction.equals("End")) {
                break;
            }

            boolean flag = fly(field, direction, beePos, bonusPos, pollinatedFlowers);

            if (!flag) {
                System.out.println("The bee got lost!");
                field[beePos[0]][beePos[1]] = '.';
                break;
            }
        }

        if (pollinatedFlowers[0] >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n", pollinatedFlowers[0]);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", 5 - pollinatedFlowers[0]);
        }

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean fly(char[][] field, String direction, int[] beePos, int[] bonusPos, int[] pollinatedFlowers) {
        switch (direction) {
            case "up":
                if (isOutOfField(field, beePos[0] - 1, beePos[1])) {
                    return false;
                }
                makeAction(field, direction, new int[] {beePos[0] - 1, beePos[1]}, beePos,
                        bonusPos, pollinatedFlowers);
                return true;
            case "down":
                if (isOutOfField(field, beePos[0] + 1, beePos[1])) {
                    return false;
                }
                makeAction(field, direction, new int[] {beePos[0] + 1, beePos[1]}, beePos,
                        bonusPos, pollinatedFlowers);
                return true;
            case "left":
                if (isOutOfField(field, beePos[0], beePos[1] - 1)) {
                    return false;
                }
                makeAction(field, direction, new int[] {beePos[0], beePos[1] - 1}, beePos,
                        bonusPos, pollinatedFlowers);
                return true;
            case "right":
                if (isOutOfField(field, beePos[0], beePos[1] + 1)) {
                    return false;
                }
                makeAction(field, direction, new int[] {beePos[0], beePos[1] + 1}, beePos,
                        bonusPos, pollinatedFlowers);
                return true;
        }
        return false;
    }

    private static void makeAction(char[][] field, String direction, int[] newBeePos, int[] oldBeePos,
                                   int[] bonusPos, int[] pollinatedFlowers) {
        char symbol = field[newBeePos[0]][newBeePos[1]];

        field[newBeePos[0]][newBeePos[1]] = 'B';

        field[oldBeePos[0]][oldBeePos[1]] = '.';

        if (symbol == 'f') {
            pollinatedFlowers[0]++;
        } else if (symbol == 'O') {
            fly(field, direction, newBeePos, bonusPos, pollinatedFlowers);
        }

        oldBeePos[0] = newBeePos[0];
        oldBeePos[1] = newBeePos[1];
    }

    private static boolean isOutOfField(char[][] field, int beeRow, int beeCol) {
        return beeRow < 0 || beeRow >= field.length || beeCol < 0 || beeCol >= field[beeRow].length;
    }
}
