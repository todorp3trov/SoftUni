package ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] temp = scanner.nextLine().split(";");
        for (int i = 0; i < temp.length; i++) {
            String[] asd = temp[i].split("=");
            people.put(asd[0], new Person(asd[0], Double.parseDouble(asd[1])));
        }

        temp = scanner.nextLine().split(";");
        for (int i = 0; i < temp.length; i++) {
            String[] asd = temp[i].split("=");
            products.put(asd[0], new Product(asd[0], Double.parseDouble(asd[1])));
        }

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("END")) {
            if (people.containsKey(command[0]) && products.containsKey(command[1])) {
                people.get(command[0]).buyProduct(products.get(command[1]));
            }
            command = scanner.nextLine().split(" ");
        }

        for (Person person : people.values()) {
            System.out.println(person.toString());
        }

    }
}
