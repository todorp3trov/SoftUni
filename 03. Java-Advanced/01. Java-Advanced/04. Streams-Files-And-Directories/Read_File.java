import java.io.FileInputStream;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) {
        String path = "sample.path";

        try (FileInputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte != -1) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
