import java.util.Scanner;
import java.util.TreeMap;

public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> symbolOccurrences = new TreeMap<>();

        char[] input = scanner.nextLine().toCharArray();

        for (char c : input) {
            if (!symbolOccurrences.containsKey(c)) {
                symbolOccurrences.put(c, 1);
            } else {
                symbolOccurrences.put(c, symbolOccurrences.get(c) + 1);
            }
        }

        symbolOccurrences.forEach((key, value) -> System.out.printf("%c: %d time/s\n", key, value));
    }
}
