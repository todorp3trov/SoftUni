package Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");

            people.putIfAbsent(data[0], new Person(data[0]));

            switch (data[1]) {
                case "company":
                    people.get(data[0]).setCompany(data[2], data[3], Double.parseDouble(data[4]));
                    break;
                case "pokemon":
                    people.get(data[0]).addPokemon(data[2], data[3]);
                    break;
                case "parents":
                    people.get(data[0]).addParent(data[2], data[3]);
                    break;
                case "children":
                    people.get(data[0]).addChild(data[2], data[3]);
                    break;
                case "car":
                    people.get(data[0]).setCar(data[2], Integer.parseInt(data[3]));
                    break;
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        System.out.println(people.get(input).toString());
    }
}
