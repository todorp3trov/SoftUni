import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum_Of_2x2_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numRowsAndCols = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = numRowsAndCols[0];
        int cols = numRowsAndCols[1];

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = currentRow;
        }

        int maxSum = 0;
        int[][] bestMatrix = new int[2][2];
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int currentSum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestMatrix = new int[][] {
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]}
                    };
                }
            }

        }

        System.out.printf("%d %d\n" +
                "%d %d\n" +
                "%d\n", bestMatrix[0][0], bestMatrix[0][1], bestMatrix[1][0], bestMatrix[1][1], maxSum);
    }
}
