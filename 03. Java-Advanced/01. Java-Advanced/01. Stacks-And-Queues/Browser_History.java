import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.size() == 1 || stack.size() == 0) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(input);
            }

            System.out.println(stack.peek());
            input = scanner.nextLine();
        }
    }
}
