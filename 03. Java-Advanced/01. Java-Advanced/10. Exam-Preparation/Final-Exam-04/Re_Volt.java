import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Re_Volt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(reader.readLine());
        int numCommands = Integer.parseInt(reader.readLine());

        char[][] matrix = new char[matrixSize][matrixSize];

        int[] playerPos = new int[2];

        for (int i = 0; i < matrixSize; i++) {
            char[] row = reader.readLine().toCharArray();
            for (int j = 0; j < matrixSize; j++) {
                if (row[j] == 'f') {
                    playerPos[0] = i;
                    playerPos[1] = j;
                }
                matrix[i][j] = row[j];
            }
        }

        boolean hasWon = false;

        for (int i = 0; i < numCommands; i++) {
            String direction = reader.readLine();

            boolean flag = fillMatrix(matrix, direction, playerPos);

            if (flag) {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean fillMatrix(char[][] matrix, String direction, int[] oldPlayerPos) {
        int playerRow = oldPlayerPos[0];
        int playerCol = oldPlayerPos[1];
        switch (direction) {
            case "up":
                playerRow -= 1;
                if (playerRow < 0) {
                    playerRow = matrix.length - 1;
                }
                break;
            case "down":
                playerRow += 1;
                if (playerRow >= matrix.length) {
                    playerRow = 0;
                }
                break;
            case "left":
                playerCol -= 1;
                if (playerCol < 0) {
                    playerCol = matrix.length - 1;
                }
                break;
            case "right":
                playerCol += 1;
                if (playerCol >= matrix.length) {
                    playerCol = 0;
                }
                break;
        }
        if (matrix[oldPlayerPos[0]][oldPlayerPos[1]] != 'B') {
            matrix[oldPlayerPos[0]][oldPlayerPos[1]] = '-';
        }
        boolean result = movePlayer(matrix, direction, playerRow, playerCol, oldPlayerPos);
        matrix[oldPlayerPos[0]][oldPlayerPos[1]] = 'f';
        return result;
    }

    private static boolean movePlayer(char[][] matrix, String direction, int playerRow, int playerCol, int[] oldPlayerPos) {
        if (matrix[playerRow][playerCol] != 'T') {
            oldPlayerPos[0] = playerRow;
            oldPlayerPos[1] = playerCol;
        }

        if (matrix[playerRow][playerCol] == 'B') {
            return fillMatrix(matrix, direction, oldPlayerPos);
        } else return matrix[playerRow][playerCol] == 'F';
    }
}
