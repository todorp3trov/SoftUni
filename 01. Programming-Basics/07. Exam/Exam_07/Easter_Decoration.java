import java.util.Scanner;

public class Easter_Decoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCustomers = Integer.parseInt(scanner.nextLine());
        int numberOfGoodsPurchased = 0;
        double totalProfit = 0;

        for (int i = 0; i < numberOfCustomers; i++) {
            String command = scanner.nextLine();
            int currentNumberOfGoods = 0;
            double currentProfit = 0;

            while (!command.equals("Finish")) {
                if (command.equals("basket")) {
                    currentProfit += 1.50;
                    currentNumberOfGoods++;
                } else if (command.equals("wreath")) {
                    currentProfit += 3.80;
                    currentNumberOfGoods++;
                } else if (command.equals("chocolate bunny")) {
                    currentProfit += 7;
                    currentNumberOfGoods++;
                }
                command = scanner.nextLine();
            }

            if (currentNumberOfGoods % 2 == 0) {
                currentProfit = (currentProfit * 0.8);
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", currentNumberOfGoods, currentProfit);
            totalProfit += currentProfit;
        }

        System.out.printf("Average bill per client is: %.2f leva.\n", totalProfit / numberOfCustomers);
    }
}
