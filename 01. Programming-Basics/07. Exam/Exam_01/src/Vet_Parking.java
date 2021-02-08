import java.util.Scanner;

public class Vet_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0f;

        for (int i = 1; i <= days; i++) {
            double currentPrice = 0f;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        currentPrice += 2.5;
                    } else {
                        currentPrice += 1.0;
                    }
                } else {
                    if (j % 2 == 0) {
                        currentPrice += 1.25;
                    } else {
                        currentPrice += 1.0;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, currentPrice);
            totalPrice += currentPrice;
        }

        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
