import java.util.Scanner;

public class Palindrome_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            if (isPalindrome(num)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        StringBuilder reversedNum = new StringBuilder();
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversedNum.append(lastDigit);
            temp /= 10;
        }
        if (Integer.parseInt(reversedNum.toString()) == num) {
            return true;
        } else {
            return false;
        }
    }
}
