import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int tempNumber = number;
        int sumOfDigits = 0;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += factorial(digit);
            tempNumber /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
