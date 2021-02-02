import java.util.Scanner;

public class Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            String currString = input[i];
            char firstLetter = currString.charAt(0);
            char secondLetter = currString.charAt(currString.length() - 1);
            double num = Double.parseDouble(currString.substring(1, currString.length() - 1));

            if (Character.isUpperCase(firstLetter)) {
                num /= ((int) firstLetter - 64);
            } else {
                num *= ((int) firstLetter - 96);
            }

            if (Character.isUpperCase(secondLetter)) {
                num -= ((int) secondLetter - 64);
            } else {
                num += ((int) secondLetter - 96);;
            }

            sum += num;
        }

        System.out.printf("%.2f", sum);
    }
}
