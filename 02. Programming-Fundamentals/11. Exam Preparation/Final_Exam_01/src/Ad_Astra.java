import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ad_Astra {

    private static class Product {
        String itemName;
        String date;
        int calories;

        public Product(String itemName, String date, int calories) {
            this.itemName = itemName;
            this.date = date;
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", itemName, date, calories);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Product> food = new LinkedList<>();
        int totalCalories = 0;

        String isValidItemRegex = "(\\||#)(?<item>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<cal>\\d+)\\1";
        Pattern itemPattern = Pattern.compile(isValidItemRegex);
        Matcher matcher = itemPattern.matcher(input);

        while (matcher.find()) {
            String itemName = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("cal"));

            Product product = new Product(itemName, date, calories);

            totalCalories += calories;
            food.add(product);
        }

        System.out.printf("You have food to last you for: %d days!\n", totalCalories / 2000);
        food.forEach(p -> System.out.println(p.toString()));
    }
}
