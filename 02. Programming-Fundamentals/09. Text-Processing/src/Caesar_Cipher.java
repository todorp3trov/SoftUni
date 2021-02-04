import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char) (sb.charAt(i) + 3));
        }

        System.out.println(sb.toString());
    }
}
