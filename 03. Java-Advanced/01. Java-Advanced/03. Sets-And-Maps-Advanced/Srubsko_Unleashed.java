import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Srubsko_Unleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<singer>(([A-Za-z]+) +)+)@(?<venue>(([A-Za-z]+) +)+)(?<ticketPrice>\\d+) (?<ticketsCount>\\d+)");

        LinkedHashMap<String, LinkedHashMap<String, Integer>> venues = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String singer = matcher.group("singer");
                String venue = matcher.group("venue");
                int ticketPrice = Integer.parseInt(matcher.group("ticketPrice"));
                int ticketCount = Integer.parseInt(matcher.group("ticketsCount"));

                venues.putIfAbsent(venue, new LinkedHashMap<>());

                if (!venues.get(venue).containsKey(singer)) {
                    venues.get(venue).put(singer, ticketPrice * ticketCount);
                } else {
                    venues.get(venue).put(singer, venues.get(venue).get(singer) + (ticketPrice * ticketCount));
                }
            }

            input = scanner.nextLine();
        }

        venues.forEach((key, value) -> {
            System.out.println(key);
            value.entrySet()
                    .stream()
                    .sorted((f,s) -> s.getValue() - f.getValue())
                    .forEach(e -> System.out.printf("#  %s-> %d\n", e.getKey(), e.getValue()));
        });
    }
}
