import java.io.*;

public class Line_Numbers {
    public static void main(String[] args) {
        String path = "sample.path";

        try (BufferedReader in = new BufferedReader(new FileReader(path));
             PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            String line = in.readLine();
            int lineNum = 1;
            while (line != null) {
                out.write(lineNum + ". ");
                out.write(line);
                line = in.readLine();
                out.write('\n');
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
