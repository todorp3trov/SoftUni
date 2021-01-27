import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(input[0]);
        int bombPower = Integer.parseInt(input[1]);

        while (arr.contains(bomb)) {
            int bombPosition = arr.indexOf(bomb);
            int leftBound = Math.max(0, bombPosition - bombPower);
            int rightBound = Math.min(arr.size() - 1, bombPosition + bombPower);

            for (int i = rightBound; i >= leftBound; i--) {
                arr.remove(i);
            }
        }
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
