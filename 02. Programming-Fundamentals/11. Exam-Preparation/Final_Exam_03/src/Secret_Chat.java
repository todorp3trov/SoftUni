import java.util.Scanner;

public class Secret_Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");

            switch (command[0]) {
                case "InsertSpace":
                    message = insertSpace(message, Integer.parseInt(command[1]));
                    break;
                case "Reverse":
                    message = reverse(message, command[1]);
                    break;
                case "ChangeAll":
                    message = changeAll(message, command[1], command[2]);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + message);
    }

    private static String insertSpace(String message, int index) {
        message = new StringBuilder(message).insert(index, " ").toString();
        System.out.println(message);
        return message;
    }

    private static String reverse(String message, String substring) {
        StringBuilder newMessage = new StringBuilder(message);
        if (message.contains(substring)) {
            message = message.replaceFirst(substring, "");
            newMessage = new StringBuilder(message);
            newMessage.append(new StringBuilder(substring).reverse().toString());
            System.out.println(newMessage.toString());
        } else {
            System.out.println("error");
        }
        return newMessage.toString();
    }

    private static String changeAll(String message, String substring, String replacement) {
        message = message.replaceAll(substring, replacement);
        System.out.println(message);
        return message;
    }
}
