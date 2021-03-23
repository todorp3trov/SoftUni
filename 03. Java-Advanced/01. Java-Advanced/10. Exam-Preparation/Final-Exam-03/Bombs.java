import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> bombEffects = Arrays.stream(reader.readLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> bombCasings = new ArrayDeque<>();
        Arrays.stream(reader.readLine().split(", "))
                .map(Integer::parseInt)
                .forEach(bombCasings::push);

                Map < Integer, String > bombs = new HashMap<>();
        bombs.put(40, "Datura Bombs");
        bombs.put(60, "Cherry Bombs");
        bombs.put(120, "Smoke Decoy Bombs");

        Map<String, Integer> craftedBombs = new LinkedHashMap<>();
        craftedBombs.put("Cherry Bombs", 0);
        craftedBombs.put("Datura Bombs", 0);
        craftedBombs.put("Smoke Decoy Bombs", 0);

        boolean hasSucceeded = false;

        while (!bombEffects.isEmpty() && !bombCasings.isEmpty()) {
            int sum = bombEffects.peek() + bombCasings.peek();

            if (bombs.containsKey(sum)) {
                int value = craftedBombs.get(bombs.get(sum)) + 1;
                craftedBombs.put(bombs.get(sum), value);
                bombEffects.poll();
                bombCasings.pop();
            } else {
                int casings = bombCasings.pop();
                casings -= 5;
                bombCasings.push(casings);
            }

            if (hasAllBombs(craftedBombs)) {
                hasSucceeded = true;
                break;
            }
        }

        if (hasSucceeded) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        System.out.println("Bomb Effects: " + (bombEffects.isEmpty() ?
                "empty" :
                bombEffects.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))));

        System.out.println("Bomb Casings: " + (bombCasings.isEmpty() ?
                "empty" :
                bombCasings.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "))));

        craftedBombs.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private static boolean hasAllBombs(Map<String, Integer> craftedBombs) {
        return craftedBombs.get("Cherry Bombs") >= 3
                && craftedBombs.get("Datura Bombs") >= 3
                && craftedBombs.get("Smoke Decoy Bombs") >= 3;
    }
}
