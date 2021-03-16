package Comparing_Objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            people.add(new Person(data[0], Integer.parseInt(data[1]), data[2]));
            input = reader.readLine();
        }

        int chosenPerson = Integer.parseInt(reader.readLine()) - 1;

        int numberOfEqualPeople = 0;

        for (Person person : people) {
            if (person.compareTo(people.get(chosenPerson)) == 0) {
                numberOfEqualPeople++;
            }
        }

        if (numberOfEqualPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d\n", numberOfEqualPeople, people.size() - numberOfEqualPeople, people.size());
        }
    }
}
