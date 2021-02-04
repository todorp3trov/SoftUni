import java.util.Scanner;

public class Print_And_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sumInGivenRange = 0;
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            sumInGivenRange += i;
        }

        System.out.println("\nSum: " + sumInGivenRange);
    }
}
