import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        ArrayList<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] commands = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            nuke(matrix, commands[0], commands[1], commands[2]);
            input = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    private static void fillMatrix(ArrayList<List<Integer>> matrix, int rows, int cols) {
        int startNum = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(startNum++);
            }
        }
    }

    private static void nuke(List<List<Integer>> matrix, int row, int col, int radius) {
        // destroy vertical
        for (int i = row - radius; i <= row + radius; i++) {
            if (isInRange(i, col, matrix) && i != row) {
                matrix.get(i).remove(col);
            }
        }

        // destroy horizontal
        for (int i = col + radius; i >= col - radius; i--) {
            if (isInRange(row, i, matrix)) {
                matrix.get(row).remove(i);
            }
        }
        matrix.removeIf(List::isEmpty);
    }

    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
