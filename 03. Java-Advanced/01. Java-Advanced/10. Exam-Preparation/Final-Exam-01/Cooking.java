import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> bakedGoods = new LinkedHashMap<>();
        bakedGoods.put("Bread", 0);
        bakedGoods.put("Cake", 0);
        bakedGoods.put("Fruit Pie", 0);
        bakedGoods.put("Pastry", 0);

        Map<Integer, String> foods = new HashMap<>();
        foods.put(25, "Bread");
        foods.put(50, "Cake");
        foods.put(75, "Pastry");
        foods.put(100, "Fruit Pie");

        ArrayDeque<Integer> liquids = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        for (String s : reader.readLine().split(" ")) {
            int i = Integer.parseInt(s);
            ingredients.push(i);
        }

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int sum = liquids.peek() + ingredients.peek();

            if (foods.containsKey(sum)) {
                int value = bakedGoods.get(foods.get(sum));
                bakedGoods.put(foods.get(sum), value + 1);

                liquids.poll();
                ingredients.pop();
            } else {
                liquids.poll();
                int ingredient = ingredients.pop();
                ingredient += 3;
                ingredients.push(ingredient);
            }
        }

        boolean flag = true;
        for (Integer preparedFood : bakedGoods.values()) {
            if (preparedFood == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }

        System.out.println("Liquids left: " + (liquids.isEmpty() ?
                "none" :
                liquids.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))));

        System.out.println("Ingredients left: " + (ingredients.isEmpty() ?
                "none" :
                ingredients.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))));

        bakedGoods.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
