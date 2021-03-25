package Point_In_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(
                new Point2D(coordinates[0], coordinates[1]),
                new Point2D(coordinates[2], coordinates[3]));

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine();

            result.append(rectangle.contains(new Point2D(x, y))).append(System.lineSeparator());
        }

        System.out.print(result.toString());
    }
}
