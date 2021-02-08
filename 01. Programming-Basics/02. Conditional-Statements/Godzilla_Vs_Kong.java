import java.util.Scanner;

public class Godzilla_Vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPricePerExtra = Double.parseDouble(scanner.nextLine());
        double decorPrice = budget * 0.1;

        double costOfOutfitsForExtras = outfitPricePerExtra * extras;
        if (extras > 150) {
            costOfOutfitsForExtras = costOfOutfitsForExtras - (costOfOutfitsForExtras * 0.1);
        }

        double moneyNeeded = decorPrice + costOfOutfitsForExtras;
        if (moneyNeeded > budget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", moneyNeeded - budget);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - moneyNeeded);
        }
    }
}
