import java.util.Scanner;

public class Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFishermen = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        if (season.equals("Spring")) {
            boatPrice = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            boatPrice = 4200;
        } else if (season.equals("Winter")) {
            boatPrice = 2600;
        }

        if (numFishermen <= 6) {
            boatPrice *= 0.9;
        } else if (numFishermen > 7 && numFishermen <= 11) {
            boatPrice *= 0.85;
        } else if (numFishermen > 11){
            boatPrice *= 0.75;
        }

        if (!season.equals("Autumn") && numFishermen % 2 == 0) {
            boatPrice *= 0.95;
        }

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
