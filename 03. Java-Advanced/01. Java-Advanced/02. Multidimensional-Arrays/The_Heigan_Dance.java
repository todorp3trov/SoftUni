import java.util.Scanner;

public class The_Heigan_Dance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] room = new int[15][15];
        room[7][7] = 1;

        int playerHealth = 18500;
        int playerDamage = Integer.parseInt(scanner.nextLine());

        while (true) {
            String input = scanner.nextLine();

            String[] commands = input.split(" ");
            String attackType = commands[0];
            int row = Integer.parseInt(commands[1]);
            int col = Integer.parseInt(commands[2]);


        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] integers : matrix) {
            for (int integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
