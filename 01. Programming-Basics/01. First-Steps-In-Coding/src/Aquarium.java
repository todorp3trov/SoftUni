import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aquariumLen = Integer.parseInt(scanner.nextLine());
        int aquariumWidth = Integer.parseInt(scanner.nextLine());
        int aquariumHeight = Integer.parseInt(scanner.nextLine());
        double occupiedVolume = Double.parseDouble(scanner.nextLine());

        double totalVolumeInLiters = (aquariumLen * aquariumWidth * aquariumHeight) * 0.001;
        double waterNeeded = totalVolumeInLiters * (1 - (occupiedVolume / 100));
        System.out.printf("%.2f", waterNeeded);
    }
}
