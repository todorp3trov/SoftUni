import java.util.Scanner;

public class Easter_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double depositPerGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double discountPerGuest = 1;
        if (guests >= 10 && guests <= 15) {
            discountPerGuest = 0.85;
        } else if (guests > 15 && guests <= 20) {
            discountPerGuest = 0.8;
        } else if (guests > 20) {
            discountPerGuest = 0.75;
        }

        double totalPrice = (guests * (depositPerGuest * discountPerGuest)) + (0.1 * budget);

        if (totalPrice > budget) {
            System.out.printf("No party! %.2f leva needed.", totalPrice - budget);
        } else {
            System.out.printf("It is party time! %.2f leva left.", budget - totalPrice);
        }
    }
}
