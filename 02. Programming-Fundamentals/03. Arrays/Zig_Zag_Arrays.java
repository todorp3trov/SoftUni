import java.util.Scanner;

public class Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                a[i] = Integer.parseInt(input[0]);
                b[i] = Integer.parseInt(input[1]);
            } else {
                a[i] = Integer.parseInt(input[1]);
                b[i] = Integer.parseInt(input[0]);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
