import java.util.Scanner;

public class Recursive_Fibonacci {

    private static long[] fibArray = new long[50];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getFibonacci(n));
    }

    private static long getFibonacci(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = getFibonacci(n - 1) + getFibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }
}
