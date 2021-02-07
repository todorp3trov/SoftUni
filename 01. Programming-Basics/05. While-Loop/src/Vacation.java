import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int daysSpendingMoney = 0;
        int daysPassed = 0;
        boolean savedUpForVacation = false;

        while (true) {
            String input = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            daysPassed++;

            if (input.equals("spend")) {
                daysSpendingMoney++;
                currentMoney -= amount;
                if (currentMoney <= 0) {
                    currentMoney = 0;
                }
            } else if (input.equals("save")) {
                daysSpendingMoney = 0;
                currentMoney += amount;
                if (currentMoney >= moneyNeeded) {
                    savedUpForVacation = true;
                    break;
                }
            }

            if (daysSpendingMoney == 5) {
                break;
            }
        }

        if (savedUpForVacation) {
            System.out.printf("You saved the money for %d days.", daysPassed);
        } else {
            System.out.printf("You can't save the money.\n%d", daysPassed);
        }
    }
}
