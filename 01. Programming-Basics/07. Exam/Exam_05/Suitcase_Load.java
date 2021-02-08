import java.util.Scanner;

public class Suitcase_Load {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double trunkVolume = Double.parseDouble(command);
        command = scanner.nextLine();
        int suitcasesLoaded = 0;


        while (!command.equals("End")) {
            double suitcaseVolume = Double.parseDouble(command);

            if (trunkVolume - suitcaseVolume < 0) {
                System.out.printf("No more space!\n" +
                        "Statistic: %d suitcases loaded.", suitcasesLoaded);
                return;
            }

            if (trunkVolume > suitcaseVolume) {
                trunkVolume -= suitcaseVolume;
                suitcasesLoaded++;

                if (suitcasesLoaded % 3 == 0) {
                    trunkVolume -= suitcaseVolume * 0.1;

                    if (trunkVolume < 0) {
                        suitcasesLoaded--;
                        System.out.printf("No more space!\n" +
                                "Statistic: %d suitcases loaded.", suitcasesLoaded);
                        return;
                    }
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Congratulations! All suitcases are loaded!\n" +
                "Statistic: %d suitcases loaded.", suitcasesLoaded);
    }
}
