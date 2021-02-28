import java.util.*;

public class Logs_Aggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> usersOnly = new TreeMap<>();
        HashMap<String, TreeSet<String>> usersAndIps = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String ip = data[0];
            String userName = data[1];
            int timeSpent = Integer.parseInt(data[2]);

            if (!usersOnly.containsKey(userName)) {
                usersOnly.put(userName, timeSpent);
            } else {
                usersOnly.put(userName, usersOnly.get(userName) + timeSpent);
            }

            usersAndIps.putIfAbsent(userName, new TreeSet<>());
            usersAndIps.get(userName).add(ip);
        }

        usersOnly.forEach((key, value) -> {
            System.out.printf("%s: %d [", key, value);
            System.out.print(String.join(", " ,usersAndIps.get(key)) + "]\n");
        });
    }
}
