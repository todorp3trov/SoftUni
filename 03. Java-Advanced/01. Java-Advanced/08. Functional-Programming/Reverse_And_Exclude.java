import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reverse_And_Exclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(nums);

        int divisor = Integer.parseInt(reader.readLine());

        Predicate<Integer> filter = num -> num % divisor != 0;

        nums.stream()
                .filter(filter)
                .forEach(e -> System.out.print(e + " "));
    }
}
