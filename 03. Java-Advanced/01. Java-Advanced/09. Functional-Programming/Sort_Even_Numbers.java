import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Even_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> numbersStr = Arrays.stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", numbersStr));

        numbersStr = numbersStr.stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", numbersStr));
    }
}
