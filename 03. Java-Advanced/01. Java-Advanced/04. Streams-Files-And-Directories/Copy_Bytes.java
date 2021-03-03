import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Bytes {
    public static void main(String[] args) {
        String path = "sample.path";

        try (FileInputStream in = new FileInputStream(path);
             FileOutputStream out = new FileOutputStream("output.txt")) {

            int oneByte = in.read();
            while (oneByte != -1) {
                if (oneByte == 32 || oneByte == 10) {
                    out.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }
                oneByte = in.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
