import java.util.Scanner;

public class N_N_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
