import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;

public class Get_Folder_Size {
    public static void main(String[] args) throws IOException {
        String path = "sample.path";

        File file = new File(String.valueOf(Paths.get(path)));

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(file);

        long size = 0;
        while (!queue.isEmpty()) {
            File currentFile = queue.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File f : nestedFiles) {
                if (f.isDirectory()) {
                    queue.offer(currentFile);
                } else {
                    size += Files.size(Path.of(f.getPath()));
                }
            }

        }

        System.out.println("Folder size: " + size);
    }
}