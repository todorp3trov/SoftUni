import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Predicate_Party {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> people = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        BiPredicate<String, String> startsWithString = String::startsWith;
        BiPredicate<String, String> endsWithString = String::endsWith;
        BiPredicate<String, Integer> isOfLength = (name, length) -> name.length() == length;

        String input = reader.readLine();

        while (!input.equals("Party!")) {
            String[] command = input.split("\\s+");

            switch (command[1]) {
                case "StartsWith":
                    if (command[0].equals("Double")) {
                        people.addAll(people.stream()
                                .filter(e -> startsWithString.test(e, command[2]))
                                .collect(Collectors.toList()));
                    } else if (command[0].equals("Remove")) {
                        people.removeAll(people.stream()
                                .filter(e -> startsWithString.test(e, command[2]))
                                .collect(Collectors.toList()));
                    }
                    break;
                case "EndsWith":
                    if (command[0].equals("Double")) {
                        people.addAll(people.stream()
                                .filter(e -> endsWithString.test(e, command[2]))
                                .collect(Collectors.toList()));
                    } else if (command[0].equals("Remove")) {
                        people.removeAll(people.stream()
                                .filter(e -> endsWithString.test(e, command[2]))
                                .collect(Collectors.toList()));
                    }
                    break;
                case "Length":
                    if (command[0].equals("Double")) {
                        people.addAll(people.stream()
                                .filter(e -> isOfLength.test(e, Integer.parseInt(command[2])))
                                .collect(Collectors.toList()));
                    } else if (command[0].equals("Remove")) {
                        people.removeAll(people.stream()
                                .filter(e -> isOfLength.test(e, Integer.parseInt(command[2])))
                                .collect(Collectors.toList()));
                    }
                    break;
            }

            input = reader.readLine();
        }

        Collections.sort(people);

        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(String.join(", ", people) + " are going to the party!");
        }

    }
}
