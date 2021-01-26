import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        validatePassword(password);
    }

    private static void validatePassword(String password) {
        boolean isValid = true;
        Pattern pattern = Pattern.compile("[^a-zA-z0-9]");
        Matcher matcher = pattern.matcher(password);
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        if (matcher.find()) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        int integerCount = 0;
        for (int i = 0; i < password.length(); i++) {
            try {
                int n = Integer.parseInt(String.valueOf(password.charAt(i)));
                integerCount++;
            } catch (Exception e) {
                //continue
            }
        }

        if (integerCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}
