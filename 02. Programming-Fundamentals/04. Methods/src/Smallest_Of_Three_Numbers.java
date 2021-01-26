import java.util.Scanner;

public class Smallest_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[3];
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        nums[2] = scanner.nextInt();
        printTheSmallestNumber(nums);
    }

    private static void printTheSmallestNumber(int[] nums) {
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallestNum) {
                smallestNum = nums[i];
            }
        }
        System.out.println(smallestNum);
    }
}
