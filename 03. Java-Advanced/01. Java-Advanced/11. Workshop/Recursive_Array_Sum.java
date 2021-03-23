import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(arr, arr.length - 1));
    }

    private static int sum(int[] arr, int startingIndex) {
        if (startingIndex == 0) {
            return arr[0];
        }

        return arr[startingIndex] + sum(arr, startingIndex - 1);
    }
}
