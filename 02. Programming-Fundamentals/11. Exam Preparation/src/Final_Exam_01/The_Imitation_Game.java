package Final_Exam_01;

import java.util.Scanner;

public class The_Imitation_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] commands = input.split("[|]+");

            switch (commands[0]) {
                case "Move":
                    message = move(message, Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commands[1]), commands[2]);
                    break;
                case "ChangeAll":
                    message = changeAll(message, commands[1], commands[2]);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);
    }

    private static String move(String message, int n) {
        return message.substring(n) + message.substring(0, n);
    }

    private static String insert(String message, int index, String value) {
        return new StringBuilder(message).insert(index, value).toString();
    }

    private static String changeAll(String message, String substring, String replacement) {
        while (message.contains(substring)) {
            message = message.replace(substring, replacement);
        }
        return message;
    }
}
