import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double tubeLength = Double.parseDouble(scanner.nextLine());
        int secondsPerHundredMeters = Integer.parseInt(scanner.nextLine());

        int controlTime = controlMinutes * 60 + controlSeconds;
        double lostTime = (tubeLength / 120) * 2.5;
        double racerTime = (secondsPerHundredMeters * (tubeLength / 100)) - lostTime;

        if (racerTime <= controlTime) {
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.", racerTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", racerTime - controlTime);
        }
    }
}
