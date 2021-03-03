import java.io.*;

public class Count_Character_Types {
    public static void main(String[] args) {
        String path = "sample.path";

        String vowels = "aeiou";
        String punctuationMarks = "!.,?";

        int vowelCount = 0, consonantsCount = 0, punctuationCount = 0;

        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line = in.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (vowels.contains(String.valueOf(c))) {
                        vowelCount++;
                    } else if (punctuationMarks.contains(String.valueOf(c))) {
                        punctuationCount++;
                    } else if (c != ' ') {
                        consonantsCount++;
                    }
                }
                line = in.readLine();
            }

            System.out.printf("Vowels: %d\n" +
                    "Consonants: %d\n" +
                    "Punctuation: %d\n", vowelCount, consonantsCount, punctuationCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
