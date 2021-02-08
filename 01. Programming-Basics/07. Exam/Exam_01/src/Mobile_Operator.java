import java.util.Scanner;

public class Mobile_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        String type = scanner.nextLine();
        String mobile = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0f;

        switch (type) {
            case "Small":
                if (time.equals("one")) {
                    price = 9.98;
                } else if (time.equals("two")) {
                    price = 8.58;
                }
                break;
            case "Middle":
                if (time.equals("one")) {
                    price = 18.99;
                } else if (time.equals("two")) {
                    price = 17.09;
                }
                break;
            case "Large":
                if (time.equals("one")) {
                    price = 25.98;
                } else if (time.equals("two")) {
                    price = 23.59;
                }
                break;
            case "ExtraLarge":
                if (time.equals("one")) {
                    price = 35.99;
                } else if (time.equals("two")) {
                    price = 31.79;
                }
                break;
        }

        if (mobile.equals("yes")) {
            if (price <= 10.00) {
                price += 5.5;
            } else if (price <= 30.00) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }

        if (time.equals("two")) {
            price -= price * 0.0375;
        }

        System.out.printf("%.2f lv.\n", price * months);
    }
}
