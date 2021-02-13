import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "1":
                    text.append(command[1]);
                    stack.push(text.toString());
                    break;
                case "2":
                    int count = Integer.parseInt(command[1]);
                    text.replace(text.length() - count, text.length(), "");
                    stack.push(text.toString());
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(command[1]) - 1));
                    break;
                case "4":
                    stack.pop();
                    if (stack.isEmpty()) {
                        text = new StringBuilder();
                    } else {
                        text = new StringBuilder(stack.peek());
                    }
                    break;
            }
        }
    }
}
