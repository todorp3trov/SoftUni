import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double safariPrice = (fuelNeeded * 2.1) + 100;

        // after discount
        if (dayOfWeek.equals("Saturday")) {
            safariPrice -= safariPrice * 0.1;
        } else if (dayOfWeek.equals("Sunday")) {
            safariPrice -= safariPrice * 0.2;
        }

        if (safariPrice <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.\n", budget - safariPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", safariPrice - budget);
        }
    }
}
