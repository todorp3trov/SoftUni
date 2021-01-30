import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "Collect":
                    collectItem(inventory, command[1]);
                    break;
                case "Drop":
                    dropItem(inventory, command[1]);
                    break;
                case "Combine Items":
                    combineItems(inventory, command[1]);
                    break;
                case "Renew":
                    renew(inventory, command[1]);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", inventory));
    }

    private static void collectItem(List<String> inventory, String item) {
        if (!inventory.contains(item)) {
            inventory.add(item);
        }
    }

    private static void dropItem(List<String> inventory, String item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
        }
    }

    private static void combineItems(List<String> inventory, String items) {
        String[] splitItems = items.split(":");
        String oldItem = splitItems[0];
        String newItem = splitItems[1];

        if (inventory.contains(oldItem)) {
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).equals(oldItem)) {
                    inventory.add(i + 1, newItem);
                    break;
                }
            }
        }
    }

    private static void renew(List<String> inventory, String item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
            inventory.add(item);
        }
    }
}
