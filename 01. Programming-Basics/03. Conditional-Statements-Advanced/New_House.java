import java.util.Scanner;

public class New_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowerPrice = 0f;
        double discount = 0;

        if (flowerType.equals("Roses")) {
            flowerPrice = 5.0;
            if (numFlowers > 80) {
                discount = 0.1;
            }
        } else if (flowerType.equals("Dahlias")) {
            flowerPrice = 3.8;
            if (numFlowers > 90) {
                discount = 0.15;
            }
        } else if (flowerType.equals("Tulips")) {
            flowerPrice = 2.8;
            if (numFlowers > 80) {
                discount = 0.15;
            }
        } else if (flowerType.equals("Narcissus")) {
            flowerPrice = 3.0;
            if (numFlowers < 120) {
                flowerPrice = flowerPrice + (flowerPrice * 0.15);
            }
        } else if (flowerType.equals("Gladiolus")) {
            flowerPrice = 2.5;
            if (numFlowers < 80) {
                flowerPrice = flowerPrice + (flowerPrice * 0.2);
            }
        }

        double totalPrice = flowerPrice * numFlowers;
        double totalPriceAfterDiscount = totalPrice - (totalPrice * discount);

        if (budget >= totalPriceAfterDiscount) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numFlowers, flowerType, budget - totalPriceAfterDiscount);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPriceAfterDiscount - budget);
        }
    }
}
