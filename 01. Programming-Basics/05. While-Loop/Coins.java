import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int change = (int) Math.floor(Double.parseDouble(scanner.nextLine()) * 100);
        int numCoins = 0;

        while (change > 0) {
            if (change - 200 >= 0) {
                change -= 200;
            } else if (change - 100 >= 0) {
                change -= 100;
            } else if (change - 50 >= 0) {
                change -= 50;
            } else if (change - 20 >= 0) {
                change -= 20;
            } else if (change - 10 >= 0) {
                change -= 10;
            } else if (change - 5 >= 0) {
                change -= 5;
            } else if (change - 2 >= 0) {
                change -= 2;
            } else {
                change -= 1;
            }

            numCoins++;
        }
        System.out.println(numCoins);
    }
}
