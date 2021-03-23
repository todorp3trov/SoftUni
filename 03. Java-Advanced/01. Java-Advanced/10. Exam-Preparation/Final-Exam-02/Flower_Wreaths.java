import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Flower_Wreaths {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        for (String s : reader.readLine().split(", ")) {
            int i = Integer.parseInt(s);
            lilies.push(i);
        }

        ArrayDeque<Integer> roses = Arrays.stream(reader.readLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int storedFlowers = 0;

        int wreaths = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            int sum = lilies.peek() + roses.peek();

            if (sum == 15) {
                wreaths++;
                lilies.pop();
                roses.poll();
            } else if (sum > 15) {
                int currentLily = lilies.pop();
                currentLily -= 2;
                lilies.push(currentLily);
            } else {
                storedFlowers += sum;
                lilies.pop();
                roses.poll();
            }
        }

        if (storedFlowers != 0) {
            wreaths += storedFlowers / 15;
        }

        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!\n", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!\n", 5 - wreaths);
        }
    }
}
