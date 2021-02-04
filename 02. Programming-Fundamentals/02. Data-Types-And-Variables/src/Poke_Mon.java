import java.util.Scanner;

public class Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int halfOfN = n / 2;
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        int pokeCount = 0;
        while (n >= m) {
            n -= m;
            pokeCount++;
            try {
                if (n == halfOfN) {
                    n /= y;
                }
            } catch (Exception e) {
                //do nothing
            }
        }

        System.out.println(n);
        System.out.println(pokeCount);
    }
}
