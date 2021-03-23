import java.util.*;

public class Sum_Of_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coins = Arrays.stream(scanner.nextLine().replace("Coins: ", "").split(", "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int sum = Integer.parseInt(scanner.nextLine().replace("Sum: ", ""));

        Map<Integer, Integer> usedCoins = new LinkedHashMap<>();

        int totalCoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            int currentCoin = coins[i];

            int currentCoinsCount = sum / currentCoin;

            if (currentCoinsCount >= 1) {
                totalCoins += currentCoinsCount;
                sum -= currentCoinsCount * currentCoin;
                usedCoins.put(currentCoin, currentCoinsCount);
            }

            if (sum == 0) {
                break;
            }
        }

        if (sum > 0) {
            System.out.println("Error");
        } else {
            System.out.println("Number of coins to take: " + totalCoins);
            usedCoins.forEach((key, value) -> System.out.printf("%d coin(s) with value %d\n", value, key));
        }
    }
}
