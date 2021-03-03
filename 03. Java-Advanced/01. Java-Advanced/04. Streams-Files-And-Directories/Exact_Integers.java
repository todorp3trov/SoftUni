import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exact_Integers {
    public static void main(String[] args) {
        String path = "sample.path";

        try (Scanner scanner = new Scanner(new FileInputStream(path));
             PrintWriter out = new PrintWriter("output.txt")) {

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    out.println(scanner.nextInt());
                }
                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
