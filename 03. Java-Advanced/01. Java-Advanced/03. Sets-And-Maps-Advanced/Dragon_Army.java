import java.util.*;

public class Dragon_Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, int[]>> dragonArmy = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String type = data[0];
            String name = data[1];
            int damage = data[2].equals("null") ? 45 : Integer.parseInt(data[2]);
            int health = data[3].equals("null") ? 250 : Integer.parseInt(data[3]);
            int armor = data[4].equals("null") ? 10 : Integer.parseInt(data[4]);

            if (!dragonArmy.containsKey(type)) {
                dragonArmy.put(type, new TreeMap<>());
            }

            if (!dragonArmy.get(type).containsKey(name)) {
                dragonArmy.get(type).put(name, new int[3]);
            }

            dragonArmy.get(type).get(name)[0] = damage;
            dragonArmy.get(type).get(name)[1] = health;
            dragonArmy.get(type).get(name)[2] = armor;
        }

        dragonArmy.forEach((key, value) -> {
            double[] averages = calcAverage(value);
            System.out.printf("%s::(%.2f/%.2f/%.2f)\n",
                    key,
                    averages[0],
                    averages[1],
                    averages[2]);
            value.forEach((key1, value1) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",
                    key1,
                    value1[0],
                    value1[1],
                    value1[2]));
        });
    }

    private static double[] calcAverage(TreeMap<String, int[]> values) {
        double damageAvg = 0f;
        double healthAvg = 0f;
        double armorAvg = 0f;

        for (Map.Entry<String, int[]> entry : values.entrySet()) {
            damageAvg += entry.getValue()[0];
            healthAvg += entry.getValue()[1];
            armorAvg += entry.getValue()[2];
        }

        damageAvg /= values.size();
        healthAvg /= values.size();
        armorAvg /= values.size();

        return new double[]{damageAvg, healthAvg, armorAvg};
    }
}
