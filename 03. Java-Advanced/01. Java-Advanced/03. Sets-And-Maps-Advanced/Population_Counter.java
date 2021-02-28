import java.util.LinkedHashMap;
import java.util.Scanner;

public class Population_Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Long> countries = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> cities = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("report")) {
            String[] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            int population = Integer.parseInt(data[2]);

            if (!countries.containsKey(country)) {
                countries.put(country, (long) population);
            } else {
                countries.put(country, countries.get(country) + population);
            }

            cities.putIfAbsent(country, new LinkedHashMap<>());
            cities.get(country).putIfAbsent(city, population);

            input = scanner.nextLine();
        }

        countries.entrySet()
                .stream()
                .sorted((f,s) -> s.getValue().compareTo(f.getValue()))
                .forEach(e -> {
            System.out.printf("%s (total population: %d)\n", e.getKey(), e.getValue());
            cities.get(e.getKey()).entrySet()
                    .stream()
                    .sorted((f,s) -> s.getValue() - f.getValue())
                    .forEach(e2 -> System.out.printf("=>%s: %d\n", e2.getKey(), e2.getValue()));

        });
    }
}
