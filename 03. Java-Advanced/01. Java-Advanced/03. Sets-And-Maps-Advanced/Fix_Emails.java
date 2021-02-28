import java.util.LinkedHashMap;
import java.util.Scanner;

public class Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();

            if (!email.contains(".com") && !email.contains(".us") && !email.contains(".uk")) {
                emails.put(name, email);
            }

            input = scanner.nextLine();
        }

        emails.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));
    }
}
