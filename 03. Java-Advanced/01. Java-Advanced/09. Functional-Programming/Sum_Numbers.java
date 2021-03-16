import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class Sum_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Function<String, Integer> parserToInt = Integer::parseInt;

        int[] numbers = Arrays.stream(reader.readLine().split(", "))
                .mapToInt(parserToInt::apply)
                .toArray();

        int sum = Arrays.stream(numbers).sum();

        System.out.printf("Count = %d\n" +
                "Sum = %d", numbers.length, sum);
    }
}
