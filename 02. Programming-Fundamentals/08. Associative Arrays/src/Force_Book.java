import java.util.*;

public class Force_Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            String[] data;
            String forceSide;
            String forceUser;

            if (input.contains(" | ")) {
                data = input.split(" \\| ");
                forceSide = data[0];
                forceUser = data[1];
                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new LinkedList<>());
                }

                boolean flag = false;
                for (String key : forceBook.keySet()) {
                    if (forceBook.get(key).contains(forceUser)) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                data = input.split(" -> ");
                forceSide = data[1];
                forceUser = data[0];
                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new LinkedList<>());
                }

                for (String key : forceBook.keySet()) {
                    if (forceBook.get(key).contains(forceUser)) {
                        forceBook.get(key).remove(forceUser);
                        break;
                    }
                }
                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
                forceBook.get(forceSide).add(forceUser);
            }

            input = scanner.nextLine();
        }

        forceBook.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((f,s) -> s.getValue().size() - f.getValue().size())
                .forEach(e -> {
                    if (!e.getValue().isEmpty()) {
                        System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
                        e.getValue()
                                .stream()
                                .sorted(String::compareTo)
                                .forEach(u -> System.out.println("! " + u));
                    }
                });
    }
}
