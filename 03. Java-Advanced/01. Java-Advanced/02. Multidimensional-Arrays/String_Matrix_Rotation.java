import java.util.ArrayList;
import java.util.Scanner;

public class String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotationAngle = Integer.parseInt(scanner.nextLine().split("[()]+")[1]) % 360;

        ArrayList<String> data = new ArrayList<>();
        int maxLen = 0;
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            data.add(input);
            if (input.length() > maxLen) {
                maxLen = input.length();
            }
            input = scanner.nextLine();
        }

        char[][] matrix = new char[data.size()][maxLen];
        for (int row = 0; row < matrix.length; row++) {
            String currentData = data.get(row);
            for (int col = 0; col < maxLen; col++) {
                if (col >= currentData.length()) {
                    matrix[row][col] = ' ';
                } else {
                    matrix[row][col] = currentData.charAt(col);
                }
            }
        }

        int rows = matrix.length;
        int cols = maxLen;

        if (rotationAngle == 90) {
            rotate90Degrees(matrix, rows, cols);
        } else if (rotationAngle == 180) {
            rotate180Degrees(matrix, rows, cols);
        } else if (rotationAngle == 270) {
            rotate270Degrees(matrix, rows, cols);
        } else {
            printMatrix(matrix, rows, cols);
        }
    }

    private static void rotate90Degrees(char[][] matrix, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rotate180Degrees(char[][] matrix, int rows, int cols) {
        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols - 1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rotate270Degrees(char[][] matrix, int rows, int cols) {
        for (int col = cols - 1; col >= 0; col--) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix(char[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
