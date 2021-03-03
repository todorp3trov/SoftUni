import java.io.File;
import java.util.ArrayDeque;

public class Nested_Folders {
    public static void main(String[] args) {
        String path = "sample.path";

        File file = new File(path);

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(file);

        int count = 0;
        while (!queue.isEmpty()) {
            File currentFile = queue.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    queue.offer(nestedFile);
                }
            }
            count++;
            System.out.println(currentFile.getName());
        }

        System.out.println(count + " folders");
    }
}
