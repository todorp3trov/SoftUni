import java.util.HashSet;
import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Double> acceptedCoins = new HashSet<>();
        acceptedCoins.add(1.0);
        acceptedCoins.add(2.0);
        acceptedCoins.add(0.5);
        acceptedCoins.add(0.2);
        acceptedCoins.add(0.1);

        String input = scanner.nextLine();
        double availableMoney = 0;
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (acceptedCoins.contains(coin)) {
                availableMoney += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
            input = scanner.nextLine();
        }
         //"Nuts", "Water", "Crisps", "Soda", "Coke". : 2.0, 0.7, 1.5, 0.8, 1.0
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (availableMoney - 2.0 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 2.0;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (availableMoney - 0.7 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    if (availableMoney - 1.5 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    if (availableMoney - 0.8 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    if (availableMoney - 1.0 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 1.0;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", availableMoney);

    }
}
