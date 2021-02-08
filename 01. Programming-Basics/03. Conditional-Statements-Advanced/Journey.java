import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySpent = 0f;
        String destination = "";
        String placeStayed = "";

        switch (season) {
            case "summer":
                placeStayed = "Camp";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpent = budget * 0.3;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    moneySpent = budget * 0.4;
                } else if (budget > 1000) {
                    destination = "Europe";
                    placeStayed = "Hotel";
                    moneySpent = budget * 0.9;
                }
                break;
            case "winter":
                placeStayed = "Hotel";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpent = budget * 0.7;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    moneySpent = budget * 0.8;
                } else if (budget > 1000) {
                    destination = "Europe";
                    moneySpent = budget * 0.9;
                }
                break;
        }

        System.out.printf("Somewhere in %s\n%s - %.2f", destination, placeStayed, moneySpent);
    }
}
