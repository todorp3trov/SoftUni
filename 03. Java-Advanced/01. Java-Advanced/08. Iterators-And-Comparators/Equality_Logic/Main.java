package Equality_Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> peopleTree = new TreeSet<>();
        Set<Person> peopleSet = new HashSet<>();

        int numPeople = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numPeople; i++) {
            String[] data = reader.readLine().split("\\s+");
            
            peopleTree.add(new Person(data[0], Integer.parseInt(data[1])));
            peopleSet.add(new Person(data[0], Integer.parseInt(data[1])));
        }

        System.out.printf("%d\n%d\n", peopleTree.size(), peopleSet.size());
    }
}
