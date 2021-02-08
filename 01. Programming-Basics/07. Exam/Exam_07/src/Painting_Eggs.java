import java.util.Scanner;

public class Painting_Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggsType = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int eggsCount = Integer.parseInt(scanner.nextLine());

        int batchPrice = 0;
        switch (eggsType) {
            case "Large":
                if (eggsColor.equals("Red")) {
                    batchPrice = 16;
                } else if (eggsColor.equals("Green")) {
                    batchPrice = 12;
                } else if (eggsColor.equals("Yellow")) {
                    batchPrice = 9;
                }
                break;
            case "Medium":
                if (eggsColor.equals("Red")) {
                    batchPrice = 13;
                } else if (eggsColor.equals("Green")) {
                    batchPrice = 9;
                } else if (eggsColor.equals("Yellow")) {
                    batchPrice = 7;
                }
                break;
            case "Small":
                if (eggsColor.equals("Red")) {
                    batchPrice = 9;
                } else if (eggsColor.equals("Green")) {
                    batchPrice = 8;
                } else if (eggsColor.equals("Yellow")) {
                    batchPrice = 5;
                }
                break;
        }

        double totalPrice = (batchPrice * eggsCount) * 0.65;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
