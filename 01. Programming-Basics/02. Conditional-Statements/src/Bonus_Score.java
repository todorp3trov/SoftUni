import java.util.Scanner;

public class Bonus_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (num <= 100) {
            bonusPoints = 5;
        } else if (num <= 1000) {
            bonusPoints = num * 0.2;
        } else {
            bonusPoints = num * 0.1;
        }

        if (num % 2 == 0) {
            bonusPoints++;
        }
        if (num % 10 == 5) {
            bonusPoints += 2;
        }

        System.out.printf("%.2f\n%.2f", bonusPoints, num + bonusPoints);
    }
}
