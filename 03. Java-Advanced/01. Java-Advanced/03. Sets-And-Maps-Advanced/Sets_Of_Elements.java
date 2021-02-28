import java.util.LinkedHashSet;
import java.util.Scanner;

public class Sets_Of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            set1.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < m; i++) {
            set2.add(Integer.parseInt(scanner.nextLine()));
        }

        if (set1.size() > set2.size()) {
            for (int i : set2) {
                if (set1.contains(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i : set1) {
                if (set2.contains(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
