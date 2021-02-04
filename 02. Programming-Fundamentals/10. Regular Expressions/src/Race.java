import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getNameExp = "[A-Z-a-z]+";
        String getDistExp = "[0-9]";

        Pattern findName = Pattern.compile(getNameExp);
        Pattern findDist = Pattern.compile(getDistExp);

        List<String> contestantNames = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> contestants = new LinkedHashMap<>();

        for (String contestantName : contestantNames) {
            contestants.put(contestantName, 0);
        }


        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher nameMatcher = findName.matcher(input);
            StringBuilder name = new StringBuilder();

            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }

            if (contestantNames.contains(name.toString())) {
                int distanceRan = contestants.get(name.toString());
                Matcher distMatcher = findDist.matcher(input);

                while (distMatcher.find()) {
                    distanceRan += Integer.parseInt(distMatcher.group());
                }

                contestants.put(name.toString(), distanceRan);
            }

            input = scanner.nextLine();
        }

        List<String> winners = contestants.entrySet().stream()
                .sorted((f, s) -> s.getValue() - f.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int count = 1;
        for (String winner : winners) {
            if (count == 1) {
                System.out.println("1st place: " + winner);
            } else if (count == 2) {
                System.out.println("2nd place: " + winner);
            } else {
                System.out.println("3rd place: " + winner);
            }
            count++;
        }
    }
}
