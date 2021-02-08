import java.util.Scanner;

public class Characters_In_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char charOne = scanner.next().charAt(0);
        char charTwo = scanner.next().charAt(0);
        printCharsInRange(charOne, charTwo);
    }

    private static void printCharsInRange(char charOne, char charTwo) {
        int a = Math.min(charOne, charTwo);
        int b = Math.max(charOne, charTwo);
        for (int i = a + 1; i < b; i++) {
            System.out.print((char) i + " ");
        }
    }
}
