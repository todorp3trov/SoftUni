import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            if (i == 3 && !input.equals(password)) {
                System.out.println("User " + username + " blocked!");
                break;
            } else if (!input.equals(password)) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.println("User " + username + " logged in.");
                break;
            }
        }
    }
}
