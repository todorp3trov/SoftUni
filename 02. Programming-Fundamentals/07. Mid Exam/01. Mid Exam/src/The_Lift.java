import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class The_Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int fullWagons = 0;
        for (int i = 0; i < wagons.size(); i++) {
            int wagonSpace = 4 - wagons.get(i);
            if (people - wagonSpace < 0) {
                wagons.set(i, people);
                people = 0;
                break;
            } else {
                people -= wagonSpace;
                fullWagons++;
                wagons.set(i, 4);
                if (people == 0) {
                    break;
                }
            }
        }

        if (people == 0 && fullWagons == wagons.size()) {
            printWagons(wagons);
        } else if (people == 0) {
            System.out.println("The lift has empty spots!");
            printWagons(wagons);
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
            printWagons(wagons);
        }
    }

    private static void printWagons(List<Integer> wagons) {
        for (int i : wagons) {
            System.out.print(i + " ");
        }
    }
}
