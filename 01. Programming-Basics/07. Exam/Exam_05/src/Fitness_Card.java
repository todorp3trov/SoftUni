import java.util.Map;
import java.util.Scanner;

public class Fitness_Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cost = 0;

        Map<String, Integer> mapMale = Map.of("Gym", 42,
                "Boxing", 41,
                "Yoga", 45,
                "Zumba", 34,
                "Dances", 51,
                "Pilates", 39);

        Map<String, Integer> mapFemale = Map.of("Gym", 35,
                "Boxing", 37,
                "Yoga", 42,
                "Zumba", 31,
                "Dances", 53,
                "Pilates", 37);




        if (gender == 'm') {
            cost = mapMale.get(sport);
        } else {
            cost = mapFemale.get(sport);
        }

        if (age <= 19) {
            cost -= (cost * 20) / 100;
        }



        if (money > cost) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cost - money);
        }
    }
}
