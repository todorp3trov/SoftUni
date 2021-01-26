import java.util.Scanner;

public class Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        boolean flag = false;

        if (array.length == 1) {
            System.out.println(0);
            flag = true;
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(input[i]);
            }

            for (int i = 0; i < array.length; i++) {
                int leftSum = 0;
                int rightSum = 0;

                for (int j = 0; j < i; j++) {
                    leftSum += array[j];
                }

                for (int j = i + 1; j < array.length; j++) {
                    rightSum += array[j];
                }

                if (leftSum == rightSum) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
        }

        if (!flag) {
            System.out.println("no");
        }
    }
}
