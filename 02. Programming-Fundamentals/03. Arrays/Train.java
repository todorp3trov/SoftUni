import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] train = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int wagonPassengers = scanner.nextInt();
            train[i] = wagonPassengers;
            sum += wagonPassengers;
        }

        for (int wagon : train) {
            System.out.print(wagon + " ");
        }

        System.out.println("\n" + sum);
    }
}
