import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Word_Count {
    public static void main(String[] args) {
        String path = "sample.path";

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String line = in.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                for (String word : splitLine) {
                    words.putIfAbsent(word, 0);
                }
                line = in.readLine();
            }

            path = "sample.path";
            in = new BufferedReader(new FileReader(path));

            line = in.readLine();
            while (line != null) {
                String[] splitLine = line.split(" ");
                for (String word : splitLine) {
                    if (words.containsKey(word)) {
                        words.put(word, words.get(word) + 1);
                    }
                }
                line = in.readLine();
            }

            in.close();
            words.forEach((key, value) -> System.out.printf("%s - %d\n", key, value));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
