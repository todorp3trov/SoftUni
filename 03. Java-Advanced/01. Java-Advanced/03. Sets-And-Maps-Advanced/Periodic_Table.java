import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> periodicTable = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            periodicTable.addAll(Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList()));
        }

        periodicTable.forEach(e -> System.out.print(e + " "));
    }
}
