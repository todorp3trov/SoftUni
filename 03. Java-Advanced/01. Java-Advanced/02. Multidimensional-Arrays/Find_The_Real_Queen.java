import java.util.ArrayDeque;
import java.util.Scanner;

public class Find_The_Real_Queen {

    private static char[][] board = new char[8][8];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                char currentChar = scanner.next().charAt(0);
                board[row][col] = currentChar;
                if (currentChar == 'q') {
                    queue.offer(new int[] {row, col});
                }
            }
            scanner.nextLine();
        }

        for (int[] ints : queue) {
            if (checkIfRealQueen(ints)) {
                System.out.println(ints[0] + " " + ints[1]);
                return;
            }
        }
    }

    private static boolean checkIfRealQueen(int[] queenIndex) {
        int row = queenIndex[0];
        int col = queenIndex[1];

        // up and down
        for (int left = 0; left < col; left++) {
            if (board[row][left] == 'q') {
                return false;
            }
        }

        for (int right = col + 1; right < 8; right++) {
            if (board[row][right] == 'q') {
                return false;
            }
        }

        for (int up = 0; up < row; up++) {
            if (board[up][col] == 'q') {
                return false;
            }
        }

        for (int down = row + 1; down < 8; down++) {
            if (board[down][col] == 'q') {
                return false;
            }
        }

        // diagonals
        for (int leftUp = col - 1, newRow = row - 1; leftUp >= 0 && newRow >= 0; leftUp--, newRow--) {
            if (board[newRow][leftUp] == 'q') {
                return false;
            }
        }

        for (int leftDown = col + 1, newRow = row + 1; leftDown < 8 && newRow < 8; leftDown++, newRow++) {
            if (board[newRow][leftDown] == 'q') {
                return false;
            }
        }

        for (int rightUp = col + 1, newRow = row - 1; rightUp < 8 && newRow >= 0; rightUp++, newRow--) {
            if (board[newRow][rightUp] == 'q') {
                return false;
            }
        }

        for (int rightDown = col - 1, newRow = row + 1; rightDown >= 0 && newRow < 8; rightDown--, newRow++) {
            if (board[newRow][rightDown] == 'q') {
                return false;
            }
        }

        return true;
    }
}
