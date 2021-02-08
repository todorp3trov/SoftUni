import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double depositAfterPeriod = deposit + depositTime * ((deposit * (interest / 100)) / 12);
        System.out.printf("%.2f", depositAfterPeriod);
    }
}
