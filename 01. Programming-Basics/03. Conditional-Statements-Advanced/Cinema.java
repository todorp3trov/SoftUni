import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double seatPrice = 0f;
        if (projectionType.equals("Premiere")) {
            seatPrice = 12.0;
        } else if (projectionType.equals("Normal")) {
            seatPrice = 7.5;
        } else if (projectionType.equals("Discount")) {
            seatPrice = 5.0;
        }

        System.out.printf("%.2f leva", (rows * cols) * seatPrice);
    }
}
