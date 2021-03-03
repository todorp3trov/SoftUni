import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_To_File {
    public static void main(String[] args) {
        String path = "sample.path";

        String punctuation = ",.!?";

        try (FileInputStream in = new FileInputStream(path);
             FileOutputStream out = new FileOutputStream("output.txt")) {

            int oneByte = in.read();
            while (oneByte != -1) {
                if (!punctuation.contains(String.valueOf((char) oneByte))) {
                    out.write(oneByte);
                }
                oneByte = in.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
