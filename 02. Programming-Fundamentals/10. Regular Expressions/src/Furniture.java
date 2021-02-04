import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String expression = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher;

        double moneySpent = 0f;

        System.out.println("Bought furniture:");
        while (!text.equals("Purchase")) {
            matcher = pattern.matcher(text);

            if (matcher.find()) {
                System.out.println(matcher.group("item"));
                moneySpent += Double.parseDouble(matcher.group("price"))
                        * Integer.parseInt(matcher.group("quantity"));
            }

            text = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", moneySpent);
    }
}
