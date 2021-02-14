import java.util.Scanner;

public class Matrix_Shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = createStringMatrix(rows, cols, scanner);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split(" ");
            if (command.length != 5) {
                System.out.println("Invalid input!");
            } else if (command[0].equals("swap")) {
                int[] cell1 = new int[] {Integer.parseInt(command[1]), Integer.parseInt(command[2])};
                int[] cell2 = new int[] {Integer.parseInt(command[3]), Integer.parseInt(command[4])};

                if (!containsValidIndexes(cell1, cell2, rows, cols)) {
                    System.out.println("Invalid input!");
                } else {
                    String temp = matrix[cell1[0]][cell1[1]];
                    matrix[cell1[0]][cell1[1]] = matrix[cell2[0]][cell2[1]];
                    matrix[cell2[0]][cell2[1]] = temp;
                    printMatrix(matrix);
                }
            }

            input = scanner.nextLine();
        }

    }

    private static boolean containsValidIndexes(int[] cell1, int[] cell2, int rows, int cols) {
        return !((cell1[0] < 0 || cell1[0] >= rows) || (cell2[0] < 0 || cell2[0] >= rows) ||
                (cell1[1] < 0 || cell1[1] >= cols) || (cell2[1] < 0 || cell2[1] >= cols));
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] createStringMatrix(int rows, int cols, Scanner scanner) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.next();
            }
            scanner.nextLine();
        }

        return matrix;
    }
}
