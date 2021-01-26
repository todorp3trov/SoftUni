import java.util.Scanner;

public class Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = factorial(a) / factorial(b);
        System.out.printf("%.2f", result);
    }

    private static double factorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
