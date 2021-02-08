import java.util.Scanner;

public class Mountain_Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double timeNeeded = distance * timePerMeter;

        if (distance > 50) {
            double slowedDown = (Math.floor(distance / 50)) * 30;
            timeNeeded += slowedDown;
        }

        if (timeNeeded < currentRecord) {
            System.out.printf("Yes! The new record is %.2f seconds.", timeNeeded);
        }
        else {
            System.out.printf("No! He was %.2f seconds slower.", (timeNeeded - currentRecord));
        }
    }
}
