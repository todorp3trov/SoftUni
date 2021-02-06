import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Destination_Mapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> destinations = new LinkedList<>();
        long travelPoints = 0;

        String isValidDestinationRegex = "(=|/)(?<dest>[A-Z][A-Za-z]{2,})\\1";
        Pattern destinationPattern = Pattern.compile(isValidDestinationRegex);
        Matcher matcher = destinationPattern.matcher(input);

        while (matcher.find()) {
            String destination = matcher.group("dest");
            travelPoints += destination.length();
            destinations.add(destination);
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);
    }
}
