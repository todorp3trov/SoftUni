import java.util.Scanner;

public class Fruit_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasAmount = Double.parseDouble(scanner.nextLine());
        double orangesAmount = Double.parseDouble(scanner.nextLine());
        double raspberriesAmount = Double.parseDouble(scanner.nextLine());
        double strawberriesAmount = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberryPrice * 0.5;
        double orangesPrice = raspberriesPrice - (raspberriesPrice * 0.4);
        double bananasPrice = raspberriesPrice - (raspberriesPrice * 0.8);

        double totalPrice = (raspberriesPrice * raspberriesAmount) + (orangesPrice * orangesAmount) +
                (strawberryPrice * strawberriesAmount) + (bananasPrice * bananasAmount);
        System.out.printf("%.2f", totalPrice);
    }
}
