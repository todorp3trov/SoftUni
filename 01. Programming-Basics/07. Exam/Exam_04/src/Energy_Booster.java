import java.util.Scanner;

public class Energy_Booster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitAdded = scanner.nextLine();
        String packageSize = scanner.nextLine();
        int numberOfPurchases = Integer.parseInt(scanner.nextLine());
        double cost = 0;

        switch (fruitAdded) {
            case "Watermelon":
                if (packageSize.equals("small")) {
                    cost = numberOfPurchases * (2 * 56);
                } else {
                    cost = numberOfPurchases * (5 * 28.70);
                }
                break;
            case "Mango":
                if (packageSize.equals("small")) {
                    cost = numberOfPurchases * (2 * 36.66);
                } else {
                    cost = numberOfPurchases * (5 * 19.60);
                }
                break;
            case "Pineapple":
                if (packageSize.equals("small")) {
                    cost = numberOfPurchases * (2 * 42.10);
                } else {
                    cost = numberOfPurchases * (5 * 24.80);
                }
                break;
            case "Raspberry":
                if (packageSize.equals("small")) {
                    cost = numberOfPurchases * (2 * 20);
                } else {
                    cost = numberOfPurchases * (5 * 15.20);
                }
                break;
        }

        if (cost >= 400 && cost <= 1000) {
            cost -= cost * 0.15;
        } else if (cost > 1000) {
            cost -= cost * 0.5;
        }

        System.out.printf("%.2f lv.", cost);
    }
}
