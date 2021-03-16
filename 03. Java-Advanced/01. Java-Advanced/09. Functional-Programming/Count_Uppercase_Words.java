import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Count_Uppercase_Words {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Predicate<String> isWordUppercase = word -> Character.isUpperCase(word.charAt(0));

        List<String> words = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(isWordUppercase)
                .collect(Collectors.toList());

        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
