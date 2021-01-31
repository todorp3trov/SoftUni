import java.util.*;

public class Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> prog = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employeeId = data[1];

            if (!prog.containsKey(companyName)) {
                prog.put(companyName, new LinkedList<>());
            }

            if (!prog.get(companyName).contains(employeeId)) {
                prog.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        prog.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(v -> System.out.println("-- " + v));
                });
    }
}
