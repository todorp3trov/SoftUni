import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, data);

        int n = Integer.parseInt(scanner.nextLine());

        int cycle = 1;

        while (queue.size() > 1){
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        if (n == 1 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
