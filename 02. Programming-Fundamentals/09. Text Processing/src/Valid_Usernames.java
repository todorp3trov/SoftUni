import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> usernames = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        usernames.forEach(u -> {
            if (u.matches("^[A-Za-z0-9-_]{3,16}$")) {
                System.out.println(u);
            }
        });
    }
}
