import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Heart_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int cupidPosition = 0;
        int successfulHouses = 0;
        while (!input.equals("Love!")) {
            String[] splitter = input.split(" ");

            int jumpLen = Integer.parseInt(splitter[1]);
            cupidPosition += jumpLen;

            if (cupidPosition >= houses.size()) {
                cupidPosition = 0;
            }

            if (houses.get(cupidPosition) == 0) {
                System.out.printf("Place %d already had Valentine's day.\n", cupidPosition);
            } else {
                houses.set(cupidPosition, houses.get(cupidPosition) - 2);
                if (houses.get(cupidPosition) <= 0) {
                    System.out.printf("Place %d has Valentine's day.\n", cupidPosition);
                    successfulHouses++;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n", cupidPosition);
        if (successfulHouses == houses.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", houses.size() - successfulHouses);
        }
    }
}
