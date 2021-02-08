import java.util.Scanner;

public class Cat_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(scanner.nextLine());
        }

        int burnedCalories = (input[1] * input[0]) * 5;

        if (burnedCalories >= input[2] / 2) {
            System.out.printf("Yes, the walk for your cat is " +
                    "enough. Burned calories per " +
                    "day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is " +
                    "not enough. Burned calories " +
                    "per day: %d.", burnedCalories);
        }
    }
}
