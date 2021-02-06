import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fancy_Barcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String isValidItemRegex = "(@#+)(?<item>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        String productGroupRegex = "\\d+";

        Pattern validItemPattern = Pattern.compile(isValidItemRegex);
        Pattern productGroupPattern = Pattern.compile(productGroupRegex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = validItemPattern.matcher(input);
            if (matcher.matches()) {
                matcher = productGroupPattern.matcher(input);

                StringBuilder sb = new StringBuilder();
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
                if (sb.toString().isEmpty()) {
                    sb.append("00");
                }
                System.out.printf("Product group: %s\n", sb.toString());
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
