import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class List_Of_Predicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Integer> nums = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());

        List<Integer> divisors = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());;

        Predicate<Integer> filter = num -> {
            for (Integer i : divisors) {
                if (num % i != 0) {
                    return false;
                }
            }
            return true;
        };

        nums.stream()
                .filter(filter)
                .forEach(e -> System.out.print(e + " "));
    }
}
