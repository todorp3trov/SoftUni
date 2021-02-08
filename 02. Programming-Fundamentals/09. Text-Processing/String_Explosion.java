import java.util.Scanner;

public class String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            } else if (strength > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                i--;
                strength--;
            }

        }

        System.out.println(sb.toString());
    }
}
