package shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new HashMap<>();
        Arrays.stream(reader.readLine().split(";"))
                .map(personInfo -> {
                    String[] tokens = personInfo.split("=");
                    try {
                        return new Person(tokens[0], Double.parseDouble(tokens[1]));
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        System.exit(0);
                    }
                    return null;
                })
                .forEach(person -> people.putIfAbsent(person.getName(), person));

        Map<String, Product> products = new HashMap<>();
        Arrays.stream(reader.readLine().split(";"))
                .map(productInfo -> {
                    String[] tokens = productInfo.split("=");
                    try {
                        return new Product(tokens[0], Double.parseDouble(tokens[1]));
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                        System.exit(0);
                    }
                    return null;
                })
                .forEach(product -> products.putIfAbsent(product.getName(), product));


        String input = reader.readLine();
        while (!input.equals("END")) {
            String[] data = input.split(" ");

            String personBuying = data[0];
            String productBought = data[1];

            if (people.containsKey(personBuying) && products.containsKey(productBought)) {
                try {
                    people.get(personBuying).buyProduct(products.get(productBought));
                    System.out.println(personBuying + " bought " + productBought);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            input = reader.readLine();
        }

        people.values().forEach(e -> System.out.println(e.toString()));
    }
}
