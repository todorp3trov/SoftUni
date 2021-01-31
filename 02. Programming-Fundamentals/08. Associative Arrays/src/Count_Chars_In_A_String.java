import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Chars_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> map = new LinkedHashMap<>();

        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);
            if (currChar != ' ') {
                if (!map.containsKey(currChar)) {
                    map.put(currChar, 1);
                } else {
                    int value = map.get(currChar);
                    map.put(currChar, ++value);
                }
            }
        }

        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
