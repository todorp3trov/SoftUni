package Strategy_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> peopleComparedByName = new TreeSet<>(new Person.NameComparator());
        TreeSet<Person> peopleComparedByAge = new TreeSet<>(new Person.AgeComparator());

        int numPeople = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numPeople; i++) {
            String[] data = reader.readLine().split("\\s+");

            Person person = new Person(data[0], Integer.parseInt(data[1]));

            peopleComparedByName.add(person);
            peopleComparedByAge.add(person);
        }

        for (Person person : peopleComparedByName) {
            System.out.println(person.toString());
        }

        for (Person person : peopleComparedByAge) {
            System.out.println(person.toString());
        }
    }
}
