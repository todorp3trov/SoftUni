import java.util.Scanner;

public class Fitness_Center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int shakeCount = 0;
        int proteinBarCount = 0;
        double percentTraining = 0f;
        double percentBoughSupplements = 0f;

        for (int i = 0; i < clients; i++) {
            String input = scanner.nextLine();
            switch (input) {
                case "Back":
                    backCount++;
                    break;
                case "Chest":
                    chestCount++;
                    break;
                case "Abs":
                    absCount++;
                    break;
                case "Legs":
                    legsCount++;
                    break;
                case "Protein shake":
                    shakeCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    break;
            }
        }

        percentTraining = ((double) (backCount + chestCount + absCount + legsCount) / clients) * 100;
        percentBoughSupplements = ((double) (shakeCount + proteinBarCount) / clients) * 100;

        System.out.printf("%d - back\n" +
                "%d - chest\n" +
                "%d - legs\n" +
                "%d - abs\n" +
                "%d - protein shake\n" +
                "%d - protein bar\n" +
                "%.2f%% - work out\n" +
                "%.2f%% - protein", backCount, chestCount, legsCount, absCount,
                shakeCount, proteinBarCount, percentTraining, percentBoughSupplements);
    }
}
