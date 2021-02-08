import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        countVowels(word);
    }

    private static void countVowels(String word) {
        word = word.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            int currentChar = word.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'o'
                    || currentChar == 'i' || currentChar == 'u') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
