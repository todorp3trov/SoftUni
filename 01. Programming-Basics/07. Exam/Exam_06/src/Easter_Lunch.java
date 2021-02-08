import java.util.Scanner;

public class Easter_Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double easterBreadPrice = 3.20;
        double dozenEggsPrice = 4.35;
        double cookiesPrice = 5.40;
        double eggPaintPrice = 0.15;

        int easterBreadBought = Integer.parseInt(scanner.nextLine());
        int cookingCrustBought = Integer.parseInt(scanner.nextLine());
        int cookiesBought = Integer.parseInt(scanner.nextLine());

        double totalLunchPrice = (easterBreadPrice * easterBreadBought) +
                (cookingCrustBought * dozenEggsPrice) +
                ((cookingCrustBought * 12) * eggPaintPrice) +
                (cookiesBought * cookiesPrice);
        System.out.printf("%.2f", totalLunchPrice);
    }
}
