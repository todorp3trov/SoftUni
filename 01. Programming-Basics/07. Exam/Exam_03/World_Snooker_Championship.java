import java.util.Scanner;

public class World_Snooker_Championship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String picturePurchased = scanner.nextLine();

        double ticketPrice = 0f;
        double totalPrice = 0f;
        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.5;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.2;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 118.9;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 300.4;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 400.0;
                }
                break;
        }

        totalPrice = ticketPrice * ticketCount;
        if (totalPrice > 4000) {
            totalPrice -= totalPrice * 0.25;
        } else if (totalPrice > 2500) {
            totalPrice -= totalPrice * 0.1;
        }

        if (picturePurchased.equals("Y") && totalPrice < 4000) {
            totalPrice += 40 * ticketCount;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
