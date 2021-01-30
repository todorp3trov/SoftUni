import java.util.Scanner;

public class Computer_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWithoutTaxes = 0;
        double taxes = 0;
        double priceWithTaxes = 0;
        String input = scanner.nextLine();
        while (!input.equals("regular") && !input.equals("special")) {
            double partPrice = Double.parseDouble(input);

            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += partPrice;
                taxes += (0.2 * partPrice);
            }

            input = scanner.nextLine();
        }

        priceWithTaxes = priceWithoutTaxes + taxes;
        if (priceWithTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        } else if (input.equals("special")) {
            priceWithTaxes = priceWithTaxes - (0.1 * priceWithTaxes);
        }

        System.out.printf("Congratulations you've just bought a new computer!\n" +
                "Price without taxes: %.2f$\n" +
                "Taxes: %.2f$\n" +
                "-----------\n" +
                "Total price: %.2f$\n", priceWithoutTaxes, taxes, priceWithTaxes);
    }
}
