import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double cakePrice = hallRent * 0.2;
        double drinksPrice = cakePrice - (cakePrice * 0.45);
        double animatorPrice = (double) hallRent / 3;

        double totalMoneyNeeded = hallRent + cakePrice + drinksPrice + animatorPrice;
        System.out.printf("%.1f", totalMoneyNeeded);
    }
}
