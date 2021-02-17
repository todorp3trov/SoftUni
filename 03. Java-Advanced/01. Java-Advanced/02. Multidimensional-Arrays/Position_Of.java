import java.util.Arrays;
import java.util.Scanner;

public class Position_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int numberToLookFor = Integer.parseInt(scanner.nextLine());

        boolean foundNumber = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == numberToLookFor) {
                    System.out.printf("%s %s\n", row, col);
                    foundNumber = true;
                }
            }
        }

        if (!foundNumber) {
            System.out.println("not found");
        }
    }
}
