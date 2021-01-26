import java.util.Scanner;

public class Max_Sequence_Of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder currentEqualArray = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    break;
                } else {
                    currentEqualArray.append(arr[j]);
                    currentEqualArray.append(" ");
                }
            }
            if (currentEqualArray.length() > result.length()) {
                result = currentEqualArray;
            }
        }
        System.out.println(result.toString());
    }
}
