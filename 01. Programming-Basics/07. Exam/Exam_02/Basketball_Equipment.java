import java.util.Scanner;

public class Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = yearlyTax - (yearlyTax * 0.4);
        double kitPrice = shoesPrice - (shoesPrice * 0.2);
        double ballPrice = kitPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;

        double totalPrice = yearlyTax + shoesPrice + kitPrice + ballPrice + accessoriesPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
