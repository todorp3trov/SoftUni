import java.util.Scanner;

public class Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num > max) {
                max = num;
            }
        }

        int sumWithoutMaxNum = sum - max;

        if (max == sumWithoutMaxNum) {
            System.out.printf("Yes\nSum = %d", max);
        } else {
            int diff = Math.abs(max - sumWithoutMaxNum);
            System.out.printf("No\nDiff = %d", diff);
        }
    }
}
