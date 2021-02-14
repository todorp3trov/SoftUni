import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        int sumDiagonalOne = 0;
        int sumDiagonalTwo = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonalOne += matrix[i][i];
            sumDiagonalTwo += matrix[n - 1 - i][i];
        }

        System.out.println(Math.abs(sumDiagonalOne - sumDiagonalTwo));
    }
}
