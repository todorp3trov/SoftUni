import java.io.*;

public class Copy_A_Picture {
    public static void main(String[] args) {
        File file = new File("Capture.PNG");

        try (FileInputStream in = new FileInputStream(file);
             FileOutputStream out = new FileOutputStream("copy.png")) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
