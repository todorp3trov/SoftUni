import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        if (groupType.equals("Business") && groupSize >= 100) { groupSize -= 10; }

        double totalCost = 0;
        switch (day) {
            case "Friday":
                if (groupType.equals("Students")) {
                    totalCost = groupSize * 8.45;
                } else if (groupType.equals("Business")) {
                    totalCost = groupSize * 10.90;
                } else {
                    totalCost = groupSize * 15;
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    totalCost = groupSize * 9.80;
                } else if (groupType.equals("Business")) {
                    totalCost = groupSize * 15.60;
                } else {
                    totalCost = groupSize * 20;
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    totalCost = groupSize * 10.46;
                } else if (groupType.equals("Business")) {
                    totalCost = groupSize * 16;
                } else {
                    totalCost = groupSize * 22.50;
                }
                break;
        }

        double discount = 0.0;
        if (groupType.equals("Students") && groupSize >= 30) {
            discount = 0.15;
            totalCost -= totalCost * discount;
        } else  if (groupType.equals("Regular") && (groupSize >= 10 && groupSize <= 20)) {
            discount = 0.05;
            totalCost -= totalCost * discount;
        }

        System.out.printf("Total price: %.2f", totalCost);
    }
}
