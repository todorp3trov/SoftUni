import java.util.*;

public class User_Logs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String ip = data[0].substring(3);
            String username = data[2].substring(5);

            users.putIfAbsent(username, new LinkedHashMap<>());
            users.get(username).putIfAbsent(ip, 0);
            users.get(username).put(ip, users.get(username).get(ip) + 1);

            input = scanner.nextLine();
        }

        users.forEach((key, value) -> {
            System.out.println(key + ": ");
            Iterator<Map.Entry<String, Integer>> iterator = value.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                if (!iterator.hasNext()) {
                    System.out.printf("%s => %d.\n", entry.getKey(), entry.getValue());
                } else {
                    System.out.printf("%s => %d, ", entry.getKey(), entry.getValue());
                }
            }
        });
    }
}
