import java.util.Scanner;

public class Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String s1 = input[0];
        String s2 = input[1];

        int charSum = sumChars(s1, s2);
        System.out.println(charSum);
    }

    private static int sumChars(String s1, String s2) {
        int charSum = 0;

        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            charSum += (s1.charAt(i) * s2.charAt(i));
        }

        if (s1.length() > s2.length()) {
            for (int i = s2.length(); i < s1.length(); i++) {
                charSum += s1.charAt(i);
            }
        } else {
            for (int i = s1.length(); i < s2.length(); i++) {
                charSum += s2.charAt(i);
            }
        }

        return charSum;
    }
}
