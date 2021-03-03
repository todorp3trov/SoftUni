import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sum_Bytes {
    public static void main(String[] args) {
        String path = "sample.path";

        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line = in.readLine();
            long sum = 0;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                line = in.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
