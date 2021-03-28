package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Beast!")) {
            String[] data = scanner.nextLine().split(" ");

            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String gender = data.length == 3 ? data[2] : "";

            if (age < 0) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            switch (input) {
                case "Dog":
                    animals.add(new Dog(name, age, gender));
                    break;
                case "Frog":
                    animals.add(new Frog(name, age, gender));
                    break;
                case "Cat":
                    animals.add(new Cat(name, age, gender));
                    break;
                case "Kitten":
                    animals.add(new Kitten(name, age));
                    break;
                case "Tomcat":
                    animals.add(new Tomcat(name, age));
                    break;
            }

            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
