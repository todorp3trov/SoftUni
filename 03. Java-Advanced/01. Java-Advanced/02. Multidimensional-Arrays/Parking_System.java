import java.util.Scanner;

public class Parking_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        boolean[][] matrix = new boolean[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = true;
        }

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String[] data = input.split(" ");
            int entryRow = Integer.parseInt(data[0]);
            int row = Integer.parseInt(data[1]);
            int col = Integer.parseInt(data[2]);

            int movesMade = Math.abs(row - entryRow) + 1;

            if (!matrix[row][col]) {
                matrix[row][col] = true;
                movesMade += col;
            } else if (isRowFull(row, matrix)) {
                System.out.printf("Row %d full\n", row);
                input = scanner.nextLine();
                continue;
            } else {
                int leftFreeSpot = col--;
                int rightFreeSpot = col++;

                while (matrix[row][leftFreeSpot]) {
                    if (leftFreeSpot == 0) {
                        break;
                    }
                    leftFreeSpot--;
                }

                while (matrix[row][rightFreeSpot]) {
                    if (rightFreeSpot == matrix[0].length - 1) {
                        break;
                    }
                    rightFreeSpot++;
                }

                int freeSpot;
                if ((col - leftFreeSpot) > (rightFreeSpot - col)) {
                    freeSpot = rightFreeSpot;
                } else {
                    freeSpot = leftFreeSpot;
                }

                if (freeSpot <= 1 && matrix[row][freeSpot]) {
                    freeSpot = rightFreeSpot;
                }
                if (matrix[row][freeSpot] && rightFreeSpot == matrix[0].length - 1) {
                    freeSpot = leftFreeSpot;
                }

                matrix[row][freeSpot] = true;
                movesMade += freeSpot;
            }

            System.out.println(movesMade);

            input = scanner.nextLine();
        }
    }

    public static boolean isRowFull(int row, boolean[][] matrix) {
        for (int i = 1; i < matrix[0].length; i++) {
            if (!matrix[row][i]) {
                return false;
            }
        }
        return true;
    }
}
