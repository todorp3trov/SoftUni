import java.util.Scanner;

public class Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int tankCapacity = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (tankCapacity + input > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                tankCapacity += input;
            }
        }
        System.out.println(tankCapacity);
    }
}
