import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Poisonous_Plants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] plants = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        int[] days = new int[n];
        for (int i = 0; i < n; i++) {

            int maxDays = 0;

            while (stack.size() > 0 && plants[stack.peek()] >= plants[i]) {
                maxDays = Math.max(maxDays, days[stack.pop()]);
            }

            if (stack.size() > 0) {
                days[i] = maxDays + 1;
            }

            stack.push(i);
        }

        System.out.println(max(days));
    }

    private static int max(int[] days) {
        int max = Integer.MIN_VALUE;
        for (int day : days) {
            if (day > max) {
                max = day;
            }
        }
        return max;
    }
}
