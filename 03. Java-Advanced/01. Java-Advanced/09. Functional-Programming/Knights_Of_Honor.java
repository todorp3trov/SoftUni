import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class Knights_Of_Honor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String> appendSirToStringAndPrint = string -> System.out.printf("Sir %s\n", string);

        Arrays.stream(reader.readLine().split("\\s+")).forEach(appendSirToStringAndPrint);
    }
}
