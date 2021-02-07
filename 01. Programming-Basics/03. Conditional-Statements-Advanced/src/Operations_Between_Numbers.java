import java.util.Scanner;

public class Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if ((operator.equals("/") || operator.equals("%")) && num2 == 0) {
            System.out.printf("Cannot divide %d by zero", num1);
            return;
        }

        String output = "";
        double result = 0f;
        switch (operator) {
            case "+":
                result = num1 + num2;
                output = String.format("%d + %d = %d", num1, num2, (int) result);
                break;
            case "-":
                result = num1 - num2;
                output = String.format("%d - %d = %d", num1, num2, (int) result);
                break;
            case "*":
                result = num1 * num2;
                output = String.format("%d * %d = %d", num1, num2, (int) result);
                break;
            case "/":
                result = (double) num1 / num2;
                output = String.format("%d / %d = %.2f", num1, num2, result);
                break;
            case "%":
                result = num1 % num2;
                output = String.format("%d %% %d = %d", num1, num2, (int) result);
                break;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                output += " - even";
            } else {
                output += " - odd";
            }
        }

        System.out.println(output);
    }
}
