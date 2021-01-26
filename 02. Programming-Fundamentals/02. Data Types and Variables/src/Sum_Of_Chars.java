import java.util.Scanner;

public class Sum_Of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumChars = 0;

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            char c = s.charAt(0);
            sumChars += c;
        }

        System.out.println("The sum equals: " + sumChars);
    }
}
