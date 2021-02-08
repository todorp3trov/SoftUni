import java.util.Scanner;

public class Easter_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        int pricePerDay = 0;
        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    pricePerDay = 30;
                } else if (dates.equals("24-27")) {
                    pricePerDay = 35;
                } else if (dates.equals("28-31")) {
                    pricePerDay = 40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerDay = 28;
                } else if (dates.equals("24-27")) {
                    pricePerDay = 32;
                } else if (dates.equals("28-31")) {
                    pricePerDay = 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerDay = 32;
                } else if (dates.equals("24-27")) {
                    pricePerDay = 37;
                } else if (dates.equals("28-31")) {
                    pricePerDay = 43;
                }
                break;
        }

        double totalPrice = pricePerDay * days;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
