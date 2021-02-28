import java.util.*;
import java.util.stream.Collectors;

public class Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Character, Integer> cardPowers = new HashMap<>();
        cardPowers.put('2', 2);
        cardPowers.put('3', 3);
        cardPowers.put('4', 4);
        cardPowers.put('5', 5);
        cardPowers.put('6', 6);
        cardPowers.put('7', 7);
        cardPowers.put('8', 8);
        cardPowers.put('9', 9);
        cardPowers.put('J', 11);
        cardPowers.put('Q', 12);
        cardPowers.put('K', 13);
        cardPowers.put('A', 14);
        cardPowers.put('S', 4);
        cardPowers.put('H', 3);
        cardPowers.put('D', 2);
        cardPowers.put('C', 1);

        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {
            String[] data = input.split(": ");
            String playerName = data[0];
            HashSet<String> cards = Arrays.stream(data[1].split(", ")).collect(Collectors.toCollection(HashSet::new));

            if (players.containsKey(playerName)) {
                players.get(playerName).addAll(cards);
            } else {
                players.put(playerName, cards);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, HashSet<String>> player : players.entrySet()) {
            int score = 0;
            for (String card : player.getValue()) {
                char[] data = card.toCharArray();
                try {
                    score += cardPowers.get(data[0]) * cardPowers.get(data[1]);
                } catch (Exception e) {
                    score += 10 * cardPowers.get(data[2]);
                }
            }

            System.out.println(player.getKey() + ": " + score);
        }
    }
}
