import java.util.Scanner;

public class Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int timesHeadsetDestroyed = lostGamesCount / 2;
        double headsetExpenses = timesHeadsetDestroyed * headsetPrice;
        int timesMouseDestroyed = lostGamesCount / 3;
        double mouseExpenses = timesMouseDestroyed * mousePrice;
        int timesKeyboardDestroyed = lostGamesCount / 6;
        double keyboardExpenses = timesKeyboardDestroyed * keyboardPrice;
        int timesDisplayDestroyed = lostGamesCount / 12;
        double dispalyExpenses = timesDisplayDestroyed * displayPrice;

        double totalRageExpenses = headsetExpenses + mouseExpenses + keyboardExpenses + dispalyExpenses;

        System.out.printf("Rage expenses: %.2f lv.", totalRageExpenses);
    }
}
