import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String[] command = input.split(", ");

            if (!shops.containsKey(command[0])) {
                shops.put(command[0], new LinkedHashMap<>());
            }

            shops.get(command[0]).put(command[1], Double.parseDouble(command[2]));

            input = scanner.nextLine();
        }

        shops.forEach((key1, value1) -> {
            System.out.println(key1 + "->");
            value1.forEach((key, value) -> {
                System.out.printf("Product: %s, Price: %.1f\n", key, value);
            });
        });
    }
}
