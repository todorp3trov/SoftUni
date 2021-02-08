import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsMade = 0;

        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            stepsMade += steps;

            if (stepsMade > 10000) {
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!", stepsMade - 10000);
                return;
            }

            input = scanner.nextLine();
        }

        stepsMade += Integer.parseInt(scanner.nextLine());
        if (stepsMade > 10000) {
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", stepsMade - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsMade);
        }
    }
}
