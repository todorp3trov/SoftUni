import java.util.Arrays;
import java.util.Scanner;

public class Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numRowsAndCols = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int row = 0; row < numRowsAndCols[0]; row++) {
            sum += Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        System.out.printf("%d\n%d\n%d\n", numRowsAndCols[0], numRowsAndCols[1], sum);
    }
}
