import java.util.Scanner;

public class Radians_To_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreesFromRadians = (Double.parseDouble(scanner.nextLine()) * 180) / Math.PI;
        System.out.printf("%.0f", degreesFromRadians);
    }
}
