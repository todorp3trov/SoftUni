import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split(" ")));

        int output = Integer.parseInt(stack.pop());

        while (!stack.isEmpty()) {
            String token = stack.pop();
            if (token.equals("+")) {
                output += Integer.parseInt(stack.pop());
            } else if (token.equals("-")) {
                output -= Integer.parseInt(stack.pop());
            }
        }

        System.out.println(output);
    }
}
