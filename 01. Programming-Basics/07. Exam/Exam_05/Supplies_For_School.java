import java.util.Scanner;

public class Supplies_For_School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPens = Integer.parseInt(scanner.nextLine());
        int numberOfMarkers = Integer.parseInt(scanner.nextLine());
        double litersOfDetergent = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double total = (numberOfPens * 5.8) + (numberOfMarkers * 7.20) + (litersOfDetergent * 1.20);
        double discounted = total - ((total * discount) / 100);

        System.out.printf("%.3f", discounted);
    }
}
