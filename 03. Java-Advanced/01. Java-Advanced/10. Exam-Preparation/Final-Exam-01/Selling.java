import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selling {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int shopSize = Integer.parseInt(reader.readLine());

        char[][] shop = new char[shopSize][shopSize];

        int[] player = new int[2];

        int[] pillarOne = new int[0];
        int[] pillarTwo = new int[0];

        for (int i = 0; i < shopSize; i++) {
            char[] row = reader.readLine().toCharArray();
            for (int j = 0; j < shopSize; j++) {
                if (row[j] == 'O') {
                    if (pillarOne.length == 0) {
                        pillarOne = new int[2];
                        pillarOne[0] = i;
                        pillarOne[1] = j;
                    } else if (pillarTwo.length == 0) {
                        pillarTwo = new int[2];
                        pillarTwo[0] = i;
                        pillarTwo[1] = j;
                    }
                } else if (row[j] == 'S') {
                    player[0] = i;
                    player[1] = j;
                }
                shop[i][j] = row[j];
            }
        }

        int[] collectedMoney = new int[1];
        boolean hasSucceeded = false;

        while (true) {
            String direction = reader.readLine();

            boolean flag = move(shop, direction, player, pillarOne, pillarTwo, collectedMoney);

            if (collectedMoney[0] >= 50) {
                hasSucceeded = true;
                break;
            } else if (!flag) {
                shop[player[0]][player[1]] = '-';
                break;
            }
        }

        if (hasSucceeded) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else {
            System.out.println("Bad news, you are out of the bakery.");
        }
        System.out.println("Money: " + collectedMoney[0]);

        for (int i = 0; i < shopSize; i++) {
            for (int j = 0; j < shopSize; j++) {
                System.out.print(shop[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean move(char[][] shop, String direction, int[] player,
                                int[] pillarOne, int[] pillarTwo, int[] collectedMoney) {

        switch (direction) {
            case "up":
                if (isOutOfShop(shop, player[0] - 1, player[1])) {
                    return false;
                } else {
                    collectedMoney[0] += makeAction(shop, player[0] - 1, player[1], player,
                            pillarOne, pillarTwo);
                    return true;
                }
            case "down":
                if (isOutOfShop(shop, player[0] + 1, player[1])) {
                    return false;
                } else {
                    collectedMoney[0] += makeAction(shop, player[0] + 1, player[1], player,
                            pillarOne, pillarTwo);
                    return true;
                }
            case "left":
                if (isOutOfShop(shop, player[0], player[1] - 1)) {
                    return false;
                } else {
                    collectedMoney[0] += makeAction(shop, player[0], player[1] - 1, player,
                            pillarOne, pillarTwo);
                    return true;
                }
            case "right":
                if (isOutOfShop(shop, player[0], player[1] + 1)) {
                    return false;
                } else {
                    collectedMoney[0] += makeAction(shop, player[0], player[1] + 1, player,
                            pillarOne, pillarTwo);
                    return true;
                }
        }
        return false;
    }

    private static boolean isOutOfShop(char[][] shop, int playerRow, int playerCol) {
        return playerRow < 0 || playerRow >= shop.length || playerCol < 0 || playerCol >= shop[playerRow].length;
    }

    private static int makeAction(char[][] shop, int playerRow, int playerCol, int[] lastPlayerPosition,
                                  int[] pillarOne, int[] pillarTwo) {
        char symbol = shop[playerRow][playerCol];
        int returnResult = 0;
        if (symbol == 'O') {
            shop[playerRow][playerCol] = '-';
            if (playerRow == pillarOne[0]) {
                playerRow = pillarTwo[0];
                playerCol = pillarTwo[1];
            } else {
                playerRow = pillarOne[0];
                playerCol = pillarOne[1];
            }
        } else if (symbol != '-') {
            returnResult = Character.getNumericValue(symbol);
        }
        shop[lastPlayerPosition[0]][lastPlayerPosition[1]] = '-';
        shop[playerRow][playerCol] = 'S';

        lastPlayerPosition[0] = playerRow;
        lastPlayerPosition[1] = playerCol;

        return returnResult;
    }

}
