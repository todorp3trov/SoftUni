package Opinion_Poll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> peopleOverThirty = new ArrayList<>();

        int numPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numPeople; i++) {
            String[] input = scanner.nextLine().split(" ");

            peopleOverThirty.add(new Person(input[0], Integer.parseInt(input[1])));
        }

        peopleOverThirty.stream()
                .filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println(person.toString()));
    }
}
