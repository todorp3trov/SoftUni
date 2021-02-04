import java.util.Scanner;

public class Replace_Repeating_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextLine().replaceAll("(\\p{L})\\1+", "$1"));

        /*StringBuilder sb = new StringBuilder(scanner.nextLine());
        for (int i = sb.length() - 1; i > 0; i--) {
            if (sb.charAt(i) == sb.charAt(i - 1)) {
                sb.replace(i - 1, i, "");
            }
        }

        System.out.println(sb.toString());*/
    }
}
