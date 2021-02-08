import java.util.Scanner;

public class Easter_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsInStore = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalEggsSold = 0;
        while (!command.equals("Close")) {
            int eggsExchanged = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (eggsInStore - eggsExchanged >= 0) {
                    eggsInStore -= eggsExchanged;
                    totalEggsSold += eggsExchanged;
                } else {
                    System.out.printf("Not enough eggs in store!\nYou can buy only %d.\n", eggsInStore);
                    break;
                }
            } else if (command.equals("Fill")) {
                eggsInStore += eggsExchanged;
            }

            command = scanner.nextLine();
        }

        if (command.equals("Close")) {
            System.out.printf("Store is closed!\n%d eggs sold.", totalEggsSold);
        }
    }
}
