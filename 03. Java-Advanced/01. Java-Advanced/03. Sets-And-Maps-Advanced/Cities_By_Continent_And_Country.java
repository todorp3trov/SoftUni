import java.util.*;

public class Cities_By_Continent_And_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (!continents.containsKey(input[0])) {
                continents.put(input[0], new LinkedHashMap<>());
                continents.get(input[0]).put(input[1], new ArrayList<>());
            } else if (!continents.get(input[0]).containsKey(input[1])) {
                continents.get(input[0]).put(input[1], new ArrayList<>());
            }

            continents.get(input[0]).get(input[1]).add(input[2]);
        }

        continents.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((country, cities) -> {
                System.out.printf("  %s -> %s\n", country, String.join(", ", cities));
            });
        });
    }
}
