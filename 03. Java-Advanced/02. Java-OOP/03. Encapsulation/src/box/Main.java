package box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        try {
            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f\n" +
                    "Lateral Surface Area - %.2f\n" +
                    "Volume - %.2f",
                    box.calculateSurfaceArea(),
                    box.calculateLateralSurfaceArea(),
                    box.calculateVolume());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
