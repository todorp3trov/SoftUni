import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class The_Party_Reservation_Filter_Module {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> people = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, BiPredicate<String, String>> predicates = new HashMap<>();

        String input = reader.readLine();

        while (!input.equals("Print")) {
            String[] command = input.split(";");

            switch (command[1]) {
                case "Starts with":
                    BiPredicate<String, String> predicate1 = String::startsWith;
                    if (command[0].equals("Add filter")) {
                        predicates.putIfAbsent(command[2], predicate1);
                    } else if (command[0].equals("Remove filter")) {
                        predicates.remove(command[2]);
                    }
                    break;
                case "Ends with":
                    BiPredicate<String, String> predicate2 = String::endsWith;
                    if (command[0].equals("Add filter")) {
                        predicates.putIfAbsent(command[2], predicate2);
                    } else if (command[0].equals("Remove filter")) {
                        predicates.remove(command[2]);
                    }
                    break;
                case "Length":
                    BiPredicate<String, String> predicate3 = (person, stringLen) -> person.length() == Integer.parseInt(stringLen);
                    if (command[0].equals("Add filter")) {
                        predicates.putIfAbsent(command[2], predicate3);
                    } else if (command[0].equals("Remove filter")) {
                        predicates.remove(command[2]);
                    }
                    break;
                case "Contains":
                    BiPredicate<String, String> predicate4 = String::contains;
                    if (command[0].equals("Add filter")) {
                        predicates.putIfAbsent(command[2], predicate4);
                    } else if (command[0].equals("Remove filter")) {
                        predicates.remove(command[2]);
                    }
                    break;
            }

            input = reader.readLine();
        }

        for (String person : people) {
            boolean flag = false;
            for (Map.Entry<String, BiPredicate<String, String>> predicate : predicates.entrySet()) {
                if (predicate.getValue().test(person, predicate.getKey())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(person + " ");
            }
        }

        System.out.println();
    }
}
