import java.util.Scanner;

public class World_Swimming_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double timeBeforeDrag = secondsPerMeter * distance;
        int timesSlowed = (int) distance / 15;
        double secondsSlowedFromDrag = timesSlowed * 12.5;
        double timeAfterDrag =  secondsSlowedFromDrag + timeBeforeDrag;

        if (timeAfterDrag < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeAfterDrag);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeAfterDrag - currentRecord);
        }
    }
}
