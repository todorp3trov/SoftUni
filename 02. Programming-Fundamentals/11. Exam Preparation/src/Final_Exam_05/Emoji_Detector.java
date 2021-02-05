package Final_Exam_05;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji_Detector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coolnessRegex = "\\d";
        String emojiRegex = "(?<emoji>([::]{2}|[**]{2})(?<emojiName>[A-Z][a-z]{2,})\\2)";

        Pattern coolnessPattern = Pattern.compile(coolnessRegex);
        Pattern emojiPattern = Pattern.compile(emojiRegex);

        String input = scanner.nextLine();

        BigInteger coolThreshold = BigInteger.ONE;
        List<String> emojis = new LinkedList<>();
        int emojiCount = 0;

        Matcher matcher = coolnessPattern.matcher(input);
        while (matcher.find()) {
            coolThreshold = coolThreshold.multiply(BigInteger.valueOf(Long.parseLong(matcher.group())));
        }

        matcher = emojiPattern.matcher(input);
        while (matcher.find()) {
            emojiCount++;
            String currentEmoji = matcher.group("emojiName");
            BigInteger currentEmojiValue = calcLetterValue(currentEmoji);
            if (currentEmojiValue.compareTo(coolThreshold) > 0) {
                emojis.add(matcher.group("emoji"));
            }
        }

        System.out.printf("Cool threshold: %d\n" +
                "%d emojis found in the text. The cool ones are:\n", coolThreshold, emojiCount);
        emojis.forEach(System.out::println);
    }

    private static BigInteger calcLetterValue(String s) {
        BigInteger value = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++) {
            value = value.add(BigInteger.valueOf(s.charAt(i)));
        }
        return value;
    }
}
