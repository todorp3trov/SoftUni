import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        mergeSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int halfIndex = arr.length / 2;

        int firstArrayLength = halfIndex;
        int secondArrayLength = arr.length - halfIndex;

        int[] firstPartition = new int[firstArrayLength];
        int[] secondPartition = new int[secondArrayLength];

        for (int i = 0; i < firstArrayLength; i++) {
            firstPartition[i] = arr[i];
        }

        for (int i = firstArrayLength; i < firstArrayLength + secondArrayLength; i++) {
            secondPartition[i - firstArrayLength] = arr[i];
        }

        firstPartition = mergeSort(firstPartition);
        secondPartition = mergeSort(secondPartition);

        int mainIndex = 0;

        int firstPartitionIndex = 0;
        int secondPartitionIndex = 0;

        while (firstPartitionIndex < firstArrayLength && secondPartitionIndex < secondArrayLength) {
            if (firstPartition[firstPartitionIndex] < secondPartition[secondPartitionIndex]) {
                arr[mainIndex] = firstPartition[firstPartitionIndex];

                mainIndex++;
                firstPartitionIndex++;
            } else {
                arr[mainIndex] = secondPartition[secondPartitionIndex];

                mainIndex++;
                secondPartitionIndex++;
            }
        }

        while (firstPartitionIndex < firstArrayLength) {
            arr[mainIndex] = firstPartition[firstPartitionIndex];

            mainIndex++;
            firstPartitionIndex++;
        }

        while (secondPartitionIndex < secondArrayLength) {
            arr[mainIndex] = secondPartition[secondPartitionIndex];

            mainIndex++;
            secondPartitionIndex++;
        }

        return arr;
    }
}
