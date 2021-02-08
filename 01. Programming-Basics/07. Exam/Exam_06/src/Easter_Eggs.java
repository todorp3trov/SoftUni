import java.util.Scanner;

public class Easter_Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEggs = Integer.parseInt(scanner.nextLine());

        int[] coloredEggsCount = new int[4];
        for (int i = 0; i < numberOfEggs; i++) {
            String command = scanner.nextLine();

            if (command.equals("red")) {
                coloredEggsCount[0]++;
            } else if (command.equals("orange")) {
                coloredEggsCount[1]++;
            } else if (command.equals("blue")) {
                coloredEggsCount[2]++;
            } else if (command.equals("green")) {
                coloredEggsCount[3]++;
            }
        }

        String temp = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < coloredEggsCount.length; i++) {
            if (coloredEggsCount[i] > max) {
                max = coloredEggsCount[i];
                if (i == 0) {
                    temp = "red";
                } else if (i == 1) {
                    temp = "orange";
                } else if (i == 2) {
                    temp = "blue";
                } else {
                    temp = "green";
                }
            }
        }

        System.out.printf("Red eggs: %d\n" +
                        "Orange eggs: %d\n" +
                        "Blue eggs: %d\n" +
                        "Green eggs: %d\n" +
                        "Max eggs: %d -> %s\n", coloredEggsCount[0], coloredEggsCount[1],
                coloredEggsCount[2], coloredEggsCount[3], max, temp);
    }
}
