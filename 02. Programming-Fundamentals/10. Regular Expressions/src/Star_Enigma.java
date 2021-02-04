import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star_Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String messageDecryption = "[starSTAR]";
        String orderDecryption = "@(?<planet>[A-Za-z]+)([^-@!:>])*:(?<pop>\\d+)([^-@!:>])*" +
                "!(?<atck>A|D)!([^-@!:>])*->(?<sdrs>\\d+)";

        Pattern decryptMessage = Pattern.compile(messageDecryption);
        Pattern decryptOrder = Pattern.compile(orderDecryption);

        List<String> attackedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher matcher = decryptMessage.matcher(message);

            int code = 0;
            while (matcher.find()) {
                code++;
            }

            StringBuilder order = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                order.append((char) (message.charAt(j) - code));
            }

            matcher = decryptOrder.matcher(order.toString());

            if (matcher.find()) {
                String planet = matcher.group("planet");
                String attackType = matcher.group("atck");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else {
                    destroyedPlanets.add(planet);
                }
            }
        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.stream().sorted(String::compareTo).forEach(s -> System.out.println("-> " + s));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.stream().sorted(String::compareTo).forEach(s -> System.out.println("-> " + s));
    }
}
