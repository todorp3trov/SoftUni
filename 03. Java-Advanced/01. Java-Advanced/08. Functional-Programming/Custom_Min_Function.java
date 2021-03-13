import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class Custom_Min_Function {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Function<int[], Integer> getMinNumber = values -> Arrays.stream(values).min().orElse(0);

        int[] ints = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(getMinNumber.apply(ints));
    }
}
