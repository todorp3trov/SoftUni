import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shopping_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Urgent":
                    addUrgentItem(groceries, command[1]);
                    break;
                case "Unnecessary":
                    removeItem(groceries, command[1]);
                    break;
                case "Correct":
                    correctItem(groceries, command[1], command[2]);
                    break;
                case "Rearrange":
                    rearrangeItem(groceries, command[1]);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", groceries));
    }

    private static void addUrgentItem(List<String> groceries, String item) {
        if (!groceries.contains(item)) {
            groceries.add(0, item);
        }
    }

    private static void removeItem(List<String> groceries, String item) {
        if (groceries.contains(item)) {
            groceries.remove(item);
        }
    }

    private static void correctItem(List<String> groceries, String oldItem, String newItem) {
        if (groceries.contains(oldItem)) {
            for (int i = 0; i < groceries.size(); i++) {
                if (groceries.get(i).equals(oldItem)) {
                    groceries.set(i, newItem);
                    break;
                }
            }
        }
    }

    private static void rearrangeItem(List<String> groceries, String item) {
        if (groceries.contains(item)) {
            groceries.remove(item);
            groceries.add(item);
        }
    }
}
