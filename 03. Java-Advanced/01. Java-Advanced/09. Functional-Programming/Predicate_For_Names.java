import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicate_For_Names {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int passingLength = Integer.parseInt(reader.readLine());

        Predicate<String> filterByLength = string -> string.length() <= passingLength;

        Arrays.stream(reader.readLine().split("\\s+"))
                .filter(filterByLength)
                .forEach(System.out::println);
    }
}
