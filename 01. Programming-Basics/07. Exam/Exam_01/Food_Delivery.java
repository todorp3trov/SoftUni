import java.util.Scanner;

public class Food_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = (chickenMenuCount * 10.35) +
                (fishMenuCount * 12.4) + (vegetarianMenuCount * 8.15);
        // Total price after dessert and delivery cost
        totalPrice += (totalPrice * 0.2) + 2.5;

        System.out.printf("Total: %.2f", totalPrice);
    }
}
