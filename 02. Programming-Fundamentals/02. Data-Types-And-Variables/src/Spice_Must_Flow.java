import java.util.Scanner;

public class Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysAtYieldSource = 0;
        int totalSpiceCollected = 0;
        while (startingYield >= 100) {
            daysAtYieldSource++;
            totalSpiceCollected += startingYield;
            if (totalSpiceCollected - 26 < 0) {
                totalSpiceCollected = 0;
            } else {
                totalSpiceCollected -= 26;
            }
            startingYield -= 10;
        }
        System.out.println(daysAtYieldSource);
        if (totalSpiceCollected - 26 < 0) {
            totalSpiceCollected = 0;
        } else {
            totalSpiceCollected -= 26;
        }
        System.out.println(totalSpiceCollected);
    }
}
