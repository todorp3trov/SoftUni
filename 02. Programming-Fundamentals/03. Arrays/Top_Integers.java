import java.util.Scanner;

public class Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        String topIntegers = "";
        for (int i = 0; i < array.length - 1; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                topIntegers += array[i] + " ";
            }
        }

        System.out.println(topIntegers + array[array.length - 1]);
    }
}
