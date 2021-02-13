import java.util.ArrayDeque;
import java.util.Scanner;

public class Infix_To_Postfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> outputQueue = new ArrayDeque<>();
        ArrayDeque<String> operatorStack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");
        for (String token : input) {
            if (token.matches("([0-9])+|([a-z])")) {
                outputQueue.offer(token);
            } else if (token.matches("[+*/-]")) {
                int tokenPrecedence = getPrecedence(token);
                while ((!operatorStack.isEmpty())
                        && (getPrecedence(operatorStack.peek()) >= tokenPrecedence)
                        && (!operatorStack.peek().equals("("))) {
                    outputQueue.offer(operatorStack.pop());
                }
                operatorStack.push(token);
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty()
                        && !operatorStack.peek().equals("(")) {
                    outputQueue.offer(operatorStack.pop());
                }
                operatorStack.pop();
            }
        }

        while (!operatorStack.isEmpty()) {
            outputQueue.offer(operatorStack.pop());
        }

        System.out.println(String.join(" ", outputQueue));
    }

    private static int getPrecedence(String token) {
        if (token.equals("*") || token.equals("/")) {
            return 3;
        } else {
            return 2;
        }
    }
}
