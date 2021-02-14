import java.util.Scanner;

public class Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        char pattern = input[1].charAt(0);

        int[][] matrix = new int[n][n];
        if (pattern == 'A') {
            patternAFill(n, matrix);
        } else {
            patternBFill(n, matrix);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void patternAFill(int n, int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = startNumber++;
            }
        }
    }

    private static void patternBFill(int n, int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = startNumber++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber++;
                }
            }
        }
    }
}
