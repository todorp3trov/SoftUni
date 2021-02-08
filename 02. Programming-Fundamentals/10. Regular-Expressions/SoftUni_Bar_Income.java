import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUni_Bar_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^%(?<name>[A-Z][a-z]+)%([^%|.$])*<(?<item>\\w+)>([^%|.$])*" +
                "\\|(?<quantity>\\d+)\\|([^%|.$0-9])*(?<price>\\d+\\.?\\d*)\\$$";
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String item = matcher.group("item");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price")) * quantity;
                totalIncome += price;
                System.out.printf("%s: %s - %.2f\n", name, item, price);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
