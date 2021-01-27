import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            manipulateList(arr, command);
            input = scanner.nextLine();
        }

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void manipulateList(List<Integer> arr, String[] command) {
        int num = Integer.parseInt(command[1]);
        if (command[0].equals("Delete")) {
            arr.removeAll(Collections.singleton(num));
        } else if (command[0].equals("Insert")) {
            int position = Integer.parseInt(command[2]);
            if (position >= 0 && position < arr.size()) {
                arr.add(position, num);
            }
        }
    }
}
