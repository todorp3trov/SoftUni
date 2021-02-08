import java.util.Scanner;

public class Easter_Guests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int easterBreadNeeded = guests / 3;
        if (guests % 3 != 0) {
            easterBreadNeeded++;
        }
        int eggsNeeded = guests * 2;

        int easterBreadPrice = easterBreadNeeded * 4;
        double eggsPrice = eggsNeeded * 0.45;
        double totalPrice = easterBreadPrice + eggsPrice;

        if (totalPrice > budget) {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.\n", totalPrice - budget);
        } else {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.\n", easterBreadNeeded, eggsNeeded);
            System.out.printf("He has %.2f lv. left.\n", budget - totalPrice);
        }
    }
}
