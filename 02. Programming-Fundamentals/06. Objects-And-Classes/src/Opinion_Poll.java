import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Opinion_Poll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> overThirty = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            if (person.getAge() > 30) {
                overThirty.add(person);
            }
        }

        Collections.sort(overThirty);
        for (Person person : overThirty) {
            System.out.println(person.toString());
        }
    }

    private static class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " - " + age;
        }

        @Override
        public int compareTo(Person person) {
            return name.compareTo(person.getName());
        }
    }
}
