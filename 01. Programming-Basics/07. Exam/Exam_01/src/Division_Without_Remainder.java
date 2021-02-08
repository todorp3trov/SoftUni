import java.util.Scanner;

public class Division_Without_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double range1 = 0f;
        double range2 = 0f;
        double range3 = 0f;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                range1++;
            }
            if (num % 3 == 0) {
                range2++;
            }
            if (num % 4 == 0) {
                range3++;
            }
        }

        range1 = (range1 / n) * 100;
        range2 = (range2 / n) * 100;
        range3 = (range3 / n) * 100;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n", range1, range2, range3);
    }
}
