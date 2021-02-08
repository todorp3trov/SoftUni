import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLen = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakePieces = cakeLen * cakeWidth;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int numPieces = Integer.parseInt(input);

            if (cakePieces - numPieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.\n", Math.abs(cakePieces - numPieces));
                return;
            } else {
                cakePieces -= numPieces;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d pieces are left.", cakePieces);
    }
}
