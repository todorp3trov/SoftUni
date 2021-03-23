import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Dating_App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> males = new ArrayDeque<>();
        Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .forEach(males::push);

        ArrayDeque<Integer> females = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        int matches = 0;

        while (!females.isEmpty() && !males.isEmpty()) {
            int femaleValue = females.peek();
            int maleValue = males.peek();
            if (femaleValue <= 0) {
                females.poll();
                continue;
            }
            if (maleValue <= 0) {
                males.pop();
                continue;
            }
            if (femaleValue % 25 == 0) {
                females.poll();
                females.poll();
                continue;
            }
            if (maleValue % 25 == 0) {
                males.pop();
                males.pop();
                continue;
            }
            females.poll();
            males.pop();
            matches++;
            if (femaleValue != maleValue) {
                males.push(maleValue - 2);
                matches--;
            }
        }
        System.out.println("Matches: " + matches);

        System.out.printf("Males left: %s\n", males.isEmpty() ?
                "none" :
                males.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.printf("Females left: %s\n", females.isEmpty() ?
                "none" :
                females.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));
    }
}
