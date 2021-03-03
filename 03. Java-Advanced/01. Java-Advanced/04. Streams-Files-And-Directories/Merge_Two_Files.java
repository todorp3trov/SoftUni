import java.io.*;

public class Merge_Two_Files {
    public static void main(String[] args) {
        String path = "sample.path";

        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

            String line = in.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    out.write(c);
                }
                out.write('\n');
                line = in.readLine();
            }

            path = "sample.path";
            in = new BufferedReader(new FileReader(path));

            line = in.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    out.write(c);
                }
                out.write('\n');
                line = in.readLine();
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
