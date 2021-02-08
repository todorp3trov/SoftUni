import java.util.Scanner;

public class High_Jump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine());
        int failedJumps = 0;
        int totalJumps = 0;

        int startingHeight = desiredHeight - 30;
        while (startingHeight <= desiredHeight) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            totalJumps++;

            if (currentJump > startingHeight) {
                startingHeight += 5;
                failedJumps = 0;
            } else {
                failedJumps++;
            }

            if (failedJumps == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", startingHeight, totalJumps);
                return;
            }
        }

        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", startingHeight - 5, totalJumps);
    }
}
