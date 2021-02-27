import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
