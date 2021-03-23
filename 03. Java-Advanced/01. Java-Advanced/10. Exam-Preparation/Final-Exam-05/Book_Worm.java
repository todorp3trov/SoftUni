import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book_Worm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder resultStr = new StringBuilder().append(reader.readLine());

        int size = Integer.parseInt(reader.readLine());

        char[][] field = new char[size][size];
        int[] playerPos = new int[0];

        for (int i = 0; i < size; i++) {
            char[] row = reader.readLine().toCharArray();
            for (int j = 0; j < size; j++) {
                if (row[j] == 'P' && playerPos.length == 0) {
                    playerPos = new int[2];
                    playerPos[0] = i;
                    playerPos[1] = j;
                }
                field[i][j] = row[j];
            }
        }

        String input = reader.readLine();
        while (!input.equals("end")) {
            fillMatrix(input, field, playerPos, resultStr);
            input = reader.readLine();
        }

        System.out.println(resultStr.toString());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String input, char[][] field, int[] playerPos, StringBuilder resultStr) {
        int playerRow = playerPos[0];
        int playerCol = playerPos[1];
        switch (input) {
            case "up":
                playerRow--;
                break;
            case "down":
                playerRow++;
                break;
            case "left":
                playerCol--;
                break;
            case "right":
                playerCol++;
                break;
        }
        if (isOutOfBounds(field, playerRow, playerCol)) {
            if (resultStr.length() > 0) {
                resultStr.replace(resultStr.length() - 1, resultStr.length(), "");
            }
        } else {
            field[playerPos[0]][playerPos[1]] = '-';
            move(field, playerRow, playerCol, resultStr);
            playerPos[0] = playerRow;
            playerPos[1] = playerCol;
        }
    }

    private static void move(char[][] field, int playerRow, int playerCol, StringBuilder resultStr) {
        if (field[playerRow][playerCol] != '-') {
            resultStr.append(field[playerRow][playerCol]);
        }
        field[playerRow][playerCol] = 'P';
    }

    private static boolean isOutOfBounds(char[][] field, int playerRow, int playerCol) {
        return playerRow < 0 || playerRow >= field.length || playerCol < 0 || playerCol >= field[playerRow].length;
    }
}
