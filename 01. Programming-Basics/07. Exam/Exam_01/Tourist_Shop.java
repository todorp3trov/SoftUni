import java.util.Scanner;

public class Tourist_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int itemCount = 0;
        double totalSpent = 0f;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            double itemPrice = Double.parseDouble(scanner.nextLine());
            itemCount++;
            if (itemCount % 3 == 0) {
                itemPrice *= 0.5;
            }

            if (budget - itemPrice < 0) {
                System.out.printf("You don't have enough money!\nYou need %.2f leva!", itemPrice - budget);
                return;
            } else {
                budget -= itemPrice;
                totalSpent += itemPrice;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", itemCount, totalSpent);
    }
}
