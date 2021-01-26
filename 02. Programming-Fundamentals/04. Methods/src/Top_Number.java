import java.util.Scanner;

public class Top_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        printTopNumbers(n);
    }

    private static void printTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (sumDigits(i) && checkIfContainsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumDigits(int i) {
        int sumOfDigits = 0;
        while (i != 0) {
            sumOfDigits += i % 10;
            i /= 10;
        }

        if (sumOfDigits % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkIfContainsOddDigit(int i) {
        while (i != 0) {
            int currentDigit = i % 10;
            if (currentDigit % 2 != 0) {
                return true;
            }
            i /= 10;
        }
        return false;
    }
}
