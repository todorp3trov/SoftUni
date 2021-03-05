package Cat_Lady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cat> cats = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Siamese":
                    cats.putIfAbsent(data[1], new Siamese(data[1], Double.parseDouble(data[2])));
                    break;
                case "Cymric":
                    cats.putIfAbsent(data[1], new Cymric(data[1], Double.parseDouble(data[2])));
                    break;
                case "StreetExtraordinaire":
                    cats.putIfAbsent(data[1], new StreetExtraordinaire(data[1], Double.parseDouble(data[2])));
                    break;
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        System.out.println(cats.get(input).toString());
    }
}
