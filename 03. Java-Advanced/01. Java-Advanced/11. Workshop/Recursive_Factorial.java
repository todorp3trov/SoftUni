import java.util.Scanner;

public class Recursive_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fact(n));
    }

    private static long fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
