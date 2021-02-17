import java.util.Scanner;

public class The_Matrix {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int rows = scanner.nextInt();
    private static final int cols = scanner.nextInt();

    // A recursive function to replace previous color 'prevC' at '(x, y)'
    // and all surrounding pixels of (x, y) with new color 'newC' and
    static void floodFillUtil(char[][] screen, int x, int y,
                              char prevC, char newC) {
        // Base cases
        if (x < 0 || x >= rows || y < 0 || y >= cols)
            return;
        if (screen[x][y] != prevC)
            return;

        // Replace the color at (x, y)
        screen[x][y] = newC;

        // Recur for north, east, south and west
        floodFillUtil(screen, x + 1, y, prevC, newC);
        floodFillUtil(screen, x - 1, y, prevC, newC);
        floodFillUtil(screen, x, y + 1, prevC, newC);
        floodFillUtil(screen, x, y - 1, prevC, newC);
    }

    // It mainly finds the previous color on (x, y) and
// calls floodFillUtil()
    static void floodFill(char[][] screen, int x, int y, char newC) {
        char prevC = screen[x][y];
        floodFillUtil(screen, x, y, prevC, newC);
    }

    public static void main(String[] args) {
        {
            scanner.nextLine();
            char[][] screen = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                String[] data = scanner.nextLine().split(" ");
                for (int col = 0; col < cols; col++) {
                    screen[row][col] = data[col].charAt(0);
                }
            }

            char newC = scanner.nextLine().charAt(0);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            floodFill(screen, x, y, newC);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++)
                    System.out.print(screen[i][j]);
                System.out.println();
            }
        }
    }

}
