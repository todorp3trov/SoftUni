import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Array_Modifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> array = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "swap":
                    swap(array, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "multiply":
                    multiply(array, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "decrease":
                    decrease(array);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(array.get(0));
        for (int i = 1; i < array.size(); i++) {
            System.out.print(", " + array.get(i));
        }
    }

    private static void swap(List<Integer> array, int index1, int index2) {
        if ((index1 >= 0 && index1 < array.size())
                && (index2 >= 0 && index2 < array.size())) {
            int temp = array.get(index1);
            array.set(index1, array.get(index2));
            array.set(index2, temp);
        }
    }

    private static void multiply(List<Integer> array, int index1, int index2) {
        if ((index1 >= 0 && index1 < array.size())
                && (index2 >= 0 && index2 < array.size())) {
            int multipliedNum = array.get(index1) * array.get(index2);
            array.set(index1, multipliedNum);
        }
    }

    private static void decrease(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) - 1);
        }
    }
}
