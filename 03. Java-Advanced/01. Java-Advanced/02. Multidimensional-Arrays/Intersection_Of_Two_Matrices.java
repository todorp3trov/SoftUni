import java.util.Scanner;

public class Intersection_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[rows][cols];

        char[][] output = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.next().charAt(0);
            }
            scanner.nextLine();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char currentChar = scanner.next().charAt(0);
                if (matrix[row][col] == currentChar) {
                    output[row][col] = currentChar;
                } else {
                    output[row][col] = '*';
                }
            }
            scanner.nextLine();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(output[row][col] + " ");
            }
            System.out.println();
        }
    }
}
