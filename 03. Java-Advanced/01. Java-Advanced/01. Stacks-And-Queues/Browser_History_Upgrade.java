import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.size() == 1 || stack.size() == 0) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    queue.addFirst(stack.pop());
                }
            } else if (input.equals("forward")) {
                if (queue.isEmpty()) {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    stack.push(queue.poll());
                }
            } else {
                stack.push(input);
                queue.clear();
            }

            System.out.println(stack.peek());
            input = scanner.nextLine();
        }
    }
}
