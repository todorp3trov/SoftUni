import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());


        for (int j = 1; j < n; j++) {
            for (int k = 1; k < n; k++) {
                for (int m = 97; m < 97 + l; m++) {
                    for (int o = 97; o < 97 + l; o++) {
                        int lastDigit = Math.max(j, k) + 1;
                        while (lastDigit <= n) {
                            System.out.printf("%d%d%s%s%d ", j, k, (char) m, (char) o, lastDigit);
                            lastDigit++;
                        }
                    }
                }
            }
        }

    }
}
