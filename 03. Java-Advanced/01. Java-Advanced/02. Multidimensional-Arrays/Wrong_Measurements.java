import java.util.Arrays;
import java.util.Scanner;

public class Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int misRow = scanner.nextInt();
        int misCol = scanner.nextInt();
        scanner.nextLine();

        int mistakenNum = matrix[misRow][misCol];
        int[][] fixedMatrix = new int[rows][matrix[0].length];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == mistakenNum) {
                    fixedMatrix[row][col] = crossSum(matrix, row, col, mistakenNum);
                } else {
                    fixedMatrix[row][col] = matrix[row][col];
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(fixedMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int crossSum(int[][] matrix, int x, int y, int mistakenNum) {
        int sum = 0;

        if (isInBounds(matrix, x + 1, y) && matrix[x + 1][y] != mistakenNum) {
            sum += matrix[x + 1][y];
        }
        if (isInBounds(matrix, x - 1, y) && matrix[x - 1][y] != mistakenNum) {
            sum += matrix[x - 1][y];
        }
        if (isInBounds(matrix, x, y + 1) && matrix[x][y + 1] != mistakenNum) {
            sum += matrix[x][y + 1];
        }
        if (isInBounds(matrix, x, y - 1) && matrix[x][y - 1] != mistakenNum) {
            sum += matrix[x][y - 1];
        }

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int x, int y) {
        return ((x >= 0 && x < matrix.length) && (y >= 0 && y < matrix[x].length));
    }
}
