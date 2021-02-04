import java.util.Scanner;

public class Print_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = scanner.nextInt();
        int end = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = beginning; i <= end; i++) {
            char c = (char) i;
            sb.append(c);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
