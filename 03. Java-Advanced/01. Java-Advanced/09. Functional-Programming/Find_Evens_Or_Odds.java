import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Find_Evens_Or_Odds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] range = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String filter = reader.readLine();

        Predicate<Integer> tester = value -> value % 2 == 0;

        printFilteredNumsInRange(range, filter, tester);
    }

    private static void printFilteredNumsInRange(int[] range, String filter, Predicate<Integer> tester) {
        if (filter.equals("odd")) {
            IntStream.range(range[0], range[1] + 1).filter(e -> !tester.test(e)).forEach(e -> System.out.print(e + " "));
        } else {
            IntStream.range(range[0], range[1] + 1).filter(tester::test).forEach(e -> System.out.print(e + " "));
        }
    }
}
