import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int terrSize = Integer.parseInt(reader.readLine());

        char[][] territory = new char[terrSize][terrSize];

        int[] snakePos = new int[2];

        int[] burrowOne = new int[0];
        int[] burrowTwo = new int[0];

        int[] foodEaten = new int[1];

        for (int i = 0; i < terrSize; i++) {
            char[] row = reader.readLine().toCharArray();
            for (int j = 0; j < terrSize; j++) {
                if (row[j] == 'S') {
                    snakePos[0] = i;
                    snakePos[1] = j;
                } else if (row[j] == 'B') {
                    if (burrowOne.length == 0) {
                        burrowOne = new int[2];
                        burrowOne[0] = i;
                        burrowOne[1] = j;
                    } else if (burrowTwo.length == 0) {
                        burrowTwo = new int[2];
                        burrowTwo[0] = i;
                        burrowTwo[1] = j;
                    }
                }
                territory[i][j] = row[j];
            }
        }

        boolean hasWon = false;

        while (true) {
            String direction = reader.readLine();

            boolean flag = fillTerritory(territory, direction, snakePos, burrowOne, burrowTwo, foodEaten);

            if (foodEaten[0] >= 10) {
                hasWon = true;
                break;
            } else if (!flag) {
                territory[snakePos[0]][snakePos[1]] = '.';
                break;
            }
        }

        if (hasWon) {
            System.out.println("You won! You fed the snake.");
        } else {
            System.out.println("Game over!");
        }

        System.out.println("Food eaten: " + foodEaten[0]);

        for (int i = 0; i < terrSize; i++) {
            for (int j = 0; j < terrSize; j++) {
                System.out.print(territory[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean fillTerritory(char[][] territory, String direction, int[] snakePos,
                                         int[] burrowOne, int[] burrowTwo, int[] foodEaten) {

        switch (direction) {
            case "up":
                if (isOutOfTerritory(territory, snakePos[0] - 1, snakePos[1])) {
                    return false;
                }
                moveSnake(territory, snakePos, snakePos[0] - 1, snakePos[1], burrowOne, burrowTwo, foodEaten);
                return true;
            case "down":
                if (isOutOfTerritory(territory, snakePos[0] + 1, snakePos[1])) {
                    return false;
                }
                moveSnake(territory, snakePos, snakePos[0] + 1, snakePos[1], burrowOne, burrowTwo, foodEaten);
                return true;
            case "left":
                if (isOutOfTerritory(territory, snakePos[0], snakePos[1] - 1)) {
                    return false;
                }
                moveSnake(territory, snakePos, snakePos[0], snakePos[1] - 1, burrowOne, burrowTwo, foodEaten);
                return true;
            case "right":
                if (isOutOfTerritory(territory, snakePos[0], snakePos[1] + 1)) {
                    return false;
                }
                moveSnake(territory, snakePos, snakePos[0], snakePos[1] + 1, burrowOne, burrowTwo, foodEaten);
                return true;
        }
        return false;
    }

    private static boolean isOutOfTerritory(char[][] territory, int snakeRow, int snakeCol) {
        return snakeRow < 0 || snakeRow >= territory.length || snakeCol < 0 || snakeCol >= territory[snakeRow].length;
    }

    private static void moveSnake(char[][] territory, int[] oldSnakePos, int newSnakeRow, int newSnakeCol,
                                  int[] burrowOne, int[] burrowTwo, int[] foodEaten) {

        if (territory[newSnakeRow][newSnakeCol] == '*') {
            foodEaten[0]++;
        } else if (territory[newSnakeRow][newSnakeCol] == 'B') {
            territory[newSnakeRow][newSnakeCol] = '.';
            if (newSnakeRow == burrowOne[0] && newSnakeCol == burrowOne[1]) {
                newSnakeRow = burrowTwo[0];
                newSnakeCol = burrowTwo[1];
            } else {
                newSnakeRow = burrowOne[0];
                newSnakeCol = burrowOne[1];
            }
        }

        territory[oldSnakePos[0]][oldSnakePos[1]] = '.';
        territory[newSnakeRow][newSnakeCol] = 'S';

        oldSnakePos[0] = newSnakeRow;
        oldSnakePos[1] = newSnakeCol;
    }
}
