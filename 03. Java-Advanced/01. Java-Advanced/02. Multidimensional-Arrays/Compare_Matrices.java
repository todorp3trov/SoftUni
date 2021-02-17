import java.util.Arrays;
import java.util.Scanner;

public class Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix1 = new int[rows1][cols1];

        for (int row = 0; row < rows1; row++) {
            matrix1[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix2 = new int[rows2][cols2];

        for (int row = 0; row < rows2; row++) {
            matrix2[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        if ((rows1 != rows2) || (cols1 != cols2)) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols1; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}
