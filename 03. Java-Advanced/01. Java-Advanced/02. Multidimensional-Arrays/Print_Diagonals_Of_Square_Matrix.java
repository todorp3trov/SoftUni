import java.util.Arrays;
import java.util.Scanner;

public class Print_Diagonals_Of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int row = 0; row < matrixSize; row++) {
            System.out.print(matrix[row][row] + " ");
        }
        System.out.println();

        for (int row = matrixSize - 1; row >= 0; row--) {
            System.out.print(matrix[row][matrixSize - 1 - row] + " ");
        }
        System.out.println();
    }
}
