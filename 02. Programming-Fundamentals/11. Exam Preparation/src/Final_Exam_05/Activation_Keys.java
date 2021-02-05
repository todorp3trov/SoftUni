package Final_Exam_05;

import java.util.Scanner;

public class Activation_Keys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            switch (commands[0]) {
                case "Contains":
                    checkIfContains(activationKey, commands[1]);
                    break;
                case "Flip":
                    activationKey = flip(activationKey, commands[1],
                            Integer.parseInt(commands[2]), Integer.parseInt(commands[3]));
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    activationKey = slice(activationKey, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    System.out.println(activationKey);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s\n", activationKey);
    }

    private static void checkIfContains(String activationKey, String substring) {
        if (activationKey.contains(substring)) {
            System.out.printf("%s contains %s\n", activationKey, substring);
        } else {
            System.out.println("Substring not found!");
        }
    }

    private static String flip(String activationKey, String caseChange, int startIndex, int endIndex) {
        if (caseChange.equals("Upper")) {
            return flipUpper(activationKey, startIndex, endIndex);
        } else {
            return flipLower(activationKey, startIndex, endIndex);
        }
    }

    private static String flipUpper(String activationKey, int startIndex, int endIndex) {
        StringBuilder newKey = new StringBuilder(activationKey);
        newKey.replace(startIndex, endIndex, activationKey.substring(startIndex, endIndex).toUpperCase());
        return newKey.toString();
    }

    private static String flipLower(String activationKey, int startIndex, int endIndex) {
        StringBuilder newKey = new StringBuilder(activationKey);
        newKey.replace(startIndex, endIndex, activationKey.substring(startIndex, endIndex).toLowerCase());
        return newKey.toString();
    }

    private static String slice(String activationKey, int startIndex, int endIndex) {
        StringBuilder newKey = new StringBuilder(activationKey);
        newKey.delete(startIndex, endIndex);
        return newKey.toString();
    }
}
