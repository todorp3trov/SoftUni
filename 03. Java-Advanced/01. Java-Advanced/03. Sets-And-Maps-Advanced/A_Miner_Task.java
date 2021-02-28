import java.util.LinkedHashMap;
import java.util.Scanner;

public class A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String resource = input;
            int resourceQuantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                resourceQuantity += resources.get(resource);
            }

            resources.put(resource, resourceQuantity);

            input = scanner.nextLine();
        }

        resources.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));
    }
}
