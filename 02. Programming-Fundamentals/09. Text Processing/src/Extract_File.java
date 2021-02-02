import java.util.Scanner;

public class Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();
        String file = filePath.substring(filePath.lastIndexOf("\\") + 1);

        String name = file.substring(0, file.indexOf("."));
        String extension = file.substring(file.indexOf(".") + 1);

        System.out.printf("File name: %s\n" +
                "File extension: %s\n", name, extension);
    }
}
