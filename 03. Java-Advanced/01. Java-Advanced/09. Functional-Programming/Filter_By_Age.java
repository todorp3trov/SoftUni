import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter_By_Age {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> people = new LinkedHashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split(", ");

            people.putIfAbsent(data[0], Integer.parseInt(data[1]));
        }

        String criteria = reader.readLine();
        int criteriaAge = Integer.parseInt(reader.readLine());
        String format = reader.readLine();

        Predicate<Integer> ageFilter = createAgeFilter(criteria, criteriaAge);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudents(people, ageFilter, printer);
    }

    private static void printFilteredStudents(
            Map<String, Integer> people,
            Predicate<Integer> ageFilter,
            Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (ageFilter.test(person.getValue())) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer = null;

        switch (format) {
            case "name age":
                printer = person -> System.out.printf("%s - %d\n", person.getKey(), person.getValue());
                break;
            case "name":
                printer = person -> System.out.printf("%s\n", person.getKey());
                break;
            case "age":
                printer = person -> System.out.printf("%d\n", person.getValue());
                break;
        }
        return printer;
    }

    private static Predicate<Integer> createAgeFilter(String criteria, int criteriaAge) {
        if (criteria.equals("older")) {
            return num -> num >= criteriaAge;
        }
        return num -> num <= criteriaAge;
    }


}
