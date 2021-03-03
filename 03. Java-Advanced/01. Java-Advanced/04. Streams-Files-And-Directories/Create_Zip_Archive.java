import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Create_Zip_Archive {
    public static void main(String[] args) {

        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream("demo.zip"))) {
            File file = new File("sample.path");
            File[] files = file.listFiles();

            for (File f : files) {
                if (!f.isDirectory()) {
                    FileInputStream in = new FileInputStream(f.getPath());
                    out.putNextEntry(new ZipEntry(f.getName()));
                    byte[] b = new byte[1024];
                    int count;

                    while ((count = in.read(b)) > 0) {
                        out.write(b, 0, count);
                    }
                    in.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
