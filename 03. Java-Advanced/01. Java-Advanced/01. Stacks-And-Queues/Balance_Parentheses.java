import java.util.ArrayDeque;
import java.util.Scanner;

public class Balance_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char parentheses = input.charAt(i);
            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                stack.push(parentheses);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }

                if (stack.peek() == '(' && parentheses == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && parentheses == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && parentheses == ']') {
                    stack.pop();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
