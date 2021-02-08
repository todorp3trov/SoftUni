import java.util.Scanner;

public class Sum_Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int runnerOne = Integer.parseInt(scanner.nextLine());
        int runnerTwo = Integer.parseInt(scanner.nextLine());
        int runnerThree = Integer.parseInt(scanner.nextLine());

        int totalSeconds = runnerOne + runnerTwo + runnerThree;
        int totalMinutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        if (remainingSeconds < 10) {
            System.out.printf("%d:0%d", totalMinutes, remainingSeconds);
        } else {
            System.out.printf("%d:%d", totalMinutes, remainingSeconds);
        }
    }
}
