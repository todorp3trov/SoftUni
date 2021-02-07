import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirror_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String isHiddenWordRegex = "(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern hiddenWordPattern = Pattern.compile(isHiddenWordRegex);
        Matcher matcher = hiddenWordPattern.matcher(input);

        List<String> mirrorWords = new LinkedList<>();
        int hiddenWordCount = 0;

        while (matcher.find()) {
            hiddenWordCount++;

            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");

            if (word1.equals(new StringBuilder(word2).reverse().toString())) {
                mirrorWords.add(String.format("%s <=> %s", word1, word2));
            }
        }

        if (hiddenWordCount == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", hiddenWordCount);
        }

        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }
    }
}
