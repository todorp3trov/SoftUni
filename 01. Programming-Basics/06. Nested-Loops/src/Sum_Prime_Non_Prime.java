import java.util.Scanner;

public class Sum_Prime_Non_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            int num = Integer.parseInt(input);

            if (num >= 0) {
                boolean isPrime = true;
                int boundary = (int) Math.sqrt(num);
                for (int i = 2; i <= boundary; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        nonPrimeSum += num;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += num;
                }
            } else {
                System.out.println("Number is negative.");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
