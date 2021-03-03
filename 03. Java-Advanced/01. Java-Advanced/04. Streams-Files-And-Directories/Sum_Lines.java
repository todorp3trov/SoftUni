import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sum_Lines {
    public static void main(String[] args) {
        String path = "sample.path";

        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line = in.readLine();
            while (line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
