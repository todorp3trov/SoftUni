import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_The_Smallest_Element {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> getMinElementIndex = list -> {
            int minIdex = 0;
            int minNum = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= minNum) {
                    minIdex = i;
                    minNum = list.get(i);
                }
            }
            return minIdex;
        };

        System.out.println(getMinElementIndex.apply(nums));
    }
}
