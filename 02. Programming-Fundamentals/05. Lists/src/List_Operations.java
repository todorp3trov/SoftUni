import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Add":
                    add(arr, command);
                    break;
                case "Insert":
                    insert(arr, command);
                    break;
                case "Remove":
                    remove(arr, command);
                    break;
                case "Shift":
                    shift(arr, command);
                    break;
            }
            input = scanner.nextLine();
        }

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void add(List<Integer> arr, String[] command) {
        arr.add(Integer.parseInt(command[1]));
    }

    private static void insert(List<Integer> arr, String[] command) {
        if (!checkIndex(Integer.parseInt(command[2]), arr.size())) {
            return;
        }
        arr.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
    }

    private static void remove(List<Integer> arr, String[] command) {
        if (!checkIndex(Integer.parseInt(command[1]), arr.size())) {
            return;
        }
        arr.remove(Integer.parseInt(command[1]));
    }

    private static void shift(List<Integer> arr, String[] command) {
        if (command[1].equals("left")) {
            shiftLeft(arr, Integer.parseInt(command[2]));
        } else {
            shiftRight(arr, Integer.parseInt(command[2]));
        }
    }

    private static void shiftLeft(List<Integer> arr, int count) {
        for (int i = 0; i < count; i++) {
            int temp = arr.get(0);
            arr.remove(0);
            arr.add(temp);
        }
    }

    private static void shiftRight(List<Integer> arr, int count) {
        for (int i = 0; i < count; i++) {
            int temp = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            arr.add(0, temp);
        }
    }

    private static boolean checkIndex(int index, int arrSize) {
        if (index < 0 || index >= arrSize) {
            System.out.println("Invalid index");
            return false;
        }
        return true;
    }
}
