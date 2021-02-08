import java.util.Scanner;

public class Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int evenSum = 0;
            int oddSum = 0;
            String tempNum = String.valueOf(i);
            for (int j = 1; j <= 5; j+=2) {
                oddSum += Integer.parseInt(String.valueOf(tempNum.charAt(j)));
            }

            for (int j = 0; j <= 5; j+=2) {
                evenSum += Integer.parseInt(String.valueOf(tempNum.charAt(j)));
            }

            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
