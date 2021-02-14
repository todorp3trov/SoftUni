import java.util.Scanner;

public class Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];
        fillMatrix(rows, cols, matrix);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int middleChar = row;
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = String.format("%c%c%c", (char) 97 + row, (char) 97 + middleChar++, (char) 97 + row);
            }
        }
    }
}
