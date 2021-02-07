import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double range1 = 0f;
        double range2 = 0f;
        double range3 = 0f;
        double range4 = 0f;
        double range5 = 0f;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                range1++;
            } else if (num <= 399) {
                range2++;
            } else if (num <= 599) {
                range3++;
            } else if (num <= 799) {
                range4++;
            } else {
                range5++;
            }
        }

        range1 /= n * 0.01;
        range2 /= n * 0.01;
        range3 /= n * 0.01;
        range4 /= n * 0.01;
        range5 /= n * 0.01;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n", range1, range2, range3, range4, range5);
    }
}
