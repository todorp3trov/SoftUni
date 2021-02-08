import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon_Dont_Go {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (!list.isEmpty()) {
            int catchIndex = scanner.nextInt();
            int removedElement;
            if (catchIndex < 0) {
                removedElement = list.get(0);
                list.set(0, list.get(list.size() - 1));
            } else if (catchIndex >= list.size()) {
                removedElement = list.get(list.size() - 1);
                list.set(list.size() - 1, list.get(0));
            } else {
                removedElement = list.get(catchIndex);
                list.remove(catchIndex);
            }

            increaseDecreaseValue(list, removedElement);

            sum += removedElement;
        }
        System.out.println(sum);
    }

    private static void increaseDecreaseValue(List<Integer> list, int removedElement) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= removedElement) {
                list.set(i, list.get(i) + removedElement);
            } else if (list.get(i) > removedElement) {
                list.set(i, list.get(i) - removedElement);
            }
        }
    }
}
