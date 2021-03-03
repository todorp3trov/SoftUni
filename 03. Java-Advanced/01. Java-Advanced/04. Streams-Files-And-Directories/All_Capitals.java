import java.io.*;

public class All_Capitals {
    public static void main(String[] args) {
        String path = "sample.path";

        try (BufferedReader in = new BufferedReader(new FileReader(path));
             PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            String line = in.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    out.write(Character.toUpperCase(c));
                }
                out.write('\n');
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
