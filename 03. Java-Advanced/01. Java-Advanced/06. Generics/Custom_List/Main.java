package Custom_List;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "Add":
                    customList.add(commands[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(commands[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(commands[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(commands[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    printList(customList);
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

            input = scanner.nextLine();
        }
    }

    private static <T extends Comparable<T>> void printList(CustomList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

}
