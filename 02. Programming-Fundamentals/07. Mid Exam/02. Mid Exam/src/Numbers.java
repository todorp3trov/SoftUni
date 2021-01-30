import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double averageValue = numbers.stream().mapToDouble(Integer::doubleValue).sum()/numbers.size();

        List<Integer> biggerThanAverage = numbers.stream()
                .filter(integer -> integer > averageValue)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .collect(Collectors.toList());

        if (biggerThanAverage.isEmpty()) {
            System.out.println("No");
        } else if (biggerThanAverage.size() < 5) {
            biggerThanAverage.forEach(integer -> System.out.print(integer + " "));
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.print(biggerThanAverage.get(i) + " ");
            }
        }
    }
}
