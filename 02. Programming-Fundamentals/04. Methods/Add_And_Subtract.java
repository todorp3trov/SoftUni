import java.util.Scanner;

public class Add_And_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        addAndSubtract(a, b, c);
    }

    private static void addAndSubtract(int a, int b, int c) {
        int sumOfFirstTwoInts = a + b;
        subtract(c, sumOfFirstTwoInts);
    }

    private static void subtract(int c, int sumOfFirstTwoInts) {
        System.out.println(sumOfFirstTwoInts - c);
    }
}
