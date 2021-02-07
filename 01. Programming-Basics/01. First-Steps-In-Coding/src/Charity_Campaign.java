import java.util.Scanner;

public class Charity_Campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int campaignLength = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int numCakes = Integer.parseInt(scanner.nextLine());
        int numWaffles = Integer.parseInt(scanner.nextLine());
        int numPancakes = Integer.parseInt(scanner.nextLine());

        double moneyFromCakes = numCakes * 45;
        double moneyFromWaffles = numWaffles * 5.8;
        double moneyFromPancakes = numPancakes * 3.2;
        double moneyRaisedPerDay = (moneyFromCakes + moneyFromWaffles + moneyFromPancakes) * confectioners;

        double totalMoneyRaised = moneyRaisedPerDay * campaignLength;
        double totalMoneyRaisedAfterCosts = totalMoneyRaised - (totalMoneyRaised / 8);
        System.out.printf("%.2f", totalMoneyRaisedAfterCosts);
    }
}
