import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anonymous_Threat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("merge")) {
                merge(list, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            } else if (command[0].equals("divide")){
                divide(list, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(" ", list));
    }

    private static void merge(List<String> list, int startIndex, int endIndex) {
        if (startIndex < 0) {
            startIndex = 0;
        } else if (startIndex >= list.size()) {
            return;
        }
        if (endIndex >= list.size()) {
            endIndex = list.size() - 1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i <= endIndex; i++) {
            result.append(list.get(i));
        }
        list.subList(startIndex, endIndex + 1).clear();
        list.add(startIndex, result.toString());
    }

    private static void divide(List<String> list, int index, int partitions) {
        List<String> tempList = new ArrayList<>();
        String toDivide = list.get(index);
        list.remove(index);
        int partitionLen = toDivide.length() / partitions;
        String toAdd = "";
        for (int i = 1; i < partitions; i++) {
            toAdd = toDivide.substring(0, partitionLen);
            toDivide = toDivide.substring(partitionLen);
            tempList.add(toAdd);
        }

        tempList.add(toDivide);
        list.addAll(index, tempList);
    }
}
