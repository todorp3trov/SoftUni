import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Sort_Lines {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.path");

        List<String> lines = Files.readAllLines(path);

        Collections.sort(lines);

        Files.write(Path.of("output.txt"), lines);
    }
}
