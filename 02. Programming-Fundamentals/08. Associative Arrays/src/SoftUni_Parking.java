import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkLot = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("register")) {
                register(input[1], input[2], parkLot);
            } else {
                unregister(input[1], parkLot);
            }
        }

        parkLot.forEach((k,v) -> System.out.println(k + " => " + v));
    }

    private static void register(String user, String numPlate, Map<String, String> parkLot) {
        if (!parkLot.containsKey(user)) {
            parkLot.put(user, numPlate);
            System.out.printf("%s registered %s successfully\n", user, numPlate);
        } else {
            System.out.printf("ERROR: already registered with plate number %s\n", numPlate);
        }
    }

    private static void unregister(String user, Map<String, String> parkLot) {
        if (parkLot.containsKey(user)) {
            parkLot.remove(user);
            System.out.printf("%s unregistered successfully\n", user);
        } else {
            System.out.printf("ERROR: user %s not found\n", user);
        }
    }
}
