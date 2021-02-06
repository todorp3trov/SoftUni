import java.util.Scanner;

public class Password_Reset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "TakeOdd":
                    password = takeOdd(password);
                    break;
                case "Cut":
                    password = cut(password, Integer.parseInt(command[1]),
                            Integer.parseInt(command[2]) + Integer.parseInt(command[1]));
                    break;
                case "Substitute":
                    password = substitute(password, command[1], command[2]);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }

    private static String takeOdd(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 1; i < password.length(); i+=2) {
            newPassword.append(password.charAt(i));
        }
        System.out.println(newPassword.toString());
        return newPassword.toString();
    }

    private static String cut(String password, int startIndex, int endIndex) {
        String cutSubstring = password.substring(startIndex, endIndex);
        password = password.replaceFirst(cutSubstring, "");
        System.out.println(password);
        return password;
    }

    private static String substitute(String password, String substring, String substitute) {
        if (password.contains(substring)) {
            password = password.replaceAll(substring, substitute);
            System.out.println(password);
            return password;
        } else {
            System.out.println("Nothing to replace!");
            return password;
        }
    }
}
