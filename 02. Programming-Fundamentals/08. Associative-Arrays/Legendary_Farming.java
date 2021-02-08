import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        keyMaterials.put("shards", 0);
        Map<String, Integer> junk = new HashMap<>();

        boolean flag = true;
        while (flag) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");
            for (int i = 1; i < input.length; i+=2) {
                String material = input[i];
                int quantity = Integer.parseInt(input[i - 1]);

                if (material.equals("shards") || material.equals("motes") || material.equals("fragments")) {
                    int value = keyMaterials.get(material) + quantity;
                    keyMaterials.put(material, value);

                    if (value >= 250) {
                        System.out.println(getLegendaryName(material) + " obtained!");
                        keyMaterials.put(material, value - 250);
                        flag = false;
                        break;
                    }
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int value = junk.get(material);
                        junk.put(material, value + quantity);
                    }
                }


            }
        }

        printKeyMaterials(keyMaterials);
        printJunk(junk);
    }

    private static String getLegendaryName(String material) {
        if (material.equals("shards")) {
            return "Shadowmourne";
        } else if (material.equals("motes")) {
            return "Dragonwrath";
        } else {
            return "Valanyr";
        }
    }

    private static void printKeyMaterials(Map<String, Integer> keyMaterials) {
        keyMaterials.entrySet()
                .stream()
                .sorted((f,s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    private static void printJunk(Map<String, Integer> junk) {
        junk.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
