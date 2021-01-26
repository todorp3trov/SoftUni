package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("Beast!")) {
            String[] splitter = scanner.nextLine().split(" ");
            try {
                Animal animal = Animal.createAnimal(command, splitter[0], Integer.parseInt(splitter[1]), splitter[2]);
                animals.add(animal);
            } catch (Exception ex) {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}
