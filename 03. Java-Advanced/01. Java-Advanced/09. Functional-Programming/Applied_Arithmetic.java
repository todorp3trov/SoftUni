import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Applied_Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], int[]> increment = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();
        Function<int[], int[]> decrement = arr -> Arrays.stream(arr).map(e -> e -= 1).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        String command = reader.readLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    ints = increment.apply(ints);
                    break;
                case "multiply":
                    ints = multiply.apply(ints);
                    break;
                case "subtract":
                    ints = decrement.apply(ints);
                    break;
                case "print":
                    print.accept(ints);
                    break;
            }
            command = reader.readLine();
        }
    }
}
