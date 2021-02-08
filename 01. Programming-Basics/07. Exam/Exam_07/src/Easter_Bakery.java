import java.util.Scanner;

public class Easter_Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourNeeded = Double.parseDouble(scanner.nextLine());
        double sugarNeeded = Double.parseDouble(scanner.nextLine());
        int eggsNeeded = Integer.parseInt(scanner.nextLine());
        int yeastNeeded = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double sugarPrice = (flourPrice * 0.75) * sugarNeeded;
        double eggsPrice = (flourPrice * 1.1) * eggsNeeded;
        double yeastPrice = ((flourPrice * 0.75) * 0.2) * yeastNeeded;
        flourPrice *= flourNeeded;

        totalPrice += sugarPrice + eggsPrice + yeastPrice + flourPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
