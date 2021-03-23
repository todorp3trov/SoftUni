import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lootbox {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> first = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> second = new ArrayDeque<>();
        Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .forEach(second::push);

        int collectionSum = 0;

        while (true) {
            if (first.isEmpty()) {
                System.out.println("First lootbox is empty");
                break;
            } else if (second.isEmpty()) {
                System.out.println("Second lootbox is empty");
                break;
            }

            int sum = first.peek() + second.peek();

            if (sum % 2 == 0) {
                collectionSum += sum;
                first.poll();
                second.pop();
            } else {
                first.addLast(second.pop());
            }
        }

        if (collectionSum >= 100) {
            System.out.println("Your loot was epic! Value: " + collectionSum);
        } else {
            System.out.println("Your loot was poor... Value: " + collectionSum);
        }
    }
}
