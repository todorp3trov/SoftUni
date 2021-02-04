import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sumDigits = 0;

        while (number != 0) {
            int digit = number % 10;
            sumDigits += digit;
            number /= 10;
        }

        System.out.println(sumDigits);
    }
}
