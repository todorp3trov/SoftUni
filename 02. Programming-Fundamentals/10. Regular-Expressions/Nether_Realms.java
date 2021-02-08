import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Nether_Realms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameRegex = "^[^\\s+,]+$";
        String healthRegex = "[^\\d+*/. -]";
        String attackRegex = "[-|+]?(\\d+\\.?\\d*)";
        String multiplyOrDivideAttackRegex = "[*/]";

        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern healthPattern = Pattern.compile(healthRegex);
        Pattern attackPattern = Pattern.compile(attackRegex);
        Pattern multiplyOrDivideAttackPattern = Pattern.compile(multiplyOrDivideAttackRegex);

        List<String> demons = Arrays.stream(scanner.nextLine().trim().split("[, ]+"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        for (String demon : demons) {
            String name = "";
            int health = 0;
            double damage = 0;

            Matcher matcher = namePattern.matcher(demon);
            if (matcher.find()) {
                name = demon;

                matcher = healthPattern.matcher(demon);
                while (matcher.find()) {
                    char temp = matcher.group().charAt(0);
                    health += temp;
                }

                matcher = attackPattern.matcher(demon);
                while (matcher.find()) {
                    damage += Double.parseDouble(matcher.group());
                }

                matcher = multiplyOrDivideAttackPattern.matcher(demon);
                while (matcher.find()) {
                    if (matcher.group().equals("*")) {
                        damage *= 2;
                    } else {
                        damage /= 2;
                    }
                }

                System.out.printf("%s - %d health, %.2f damage\n", name, health, damage);
            }
        }
    }
}
